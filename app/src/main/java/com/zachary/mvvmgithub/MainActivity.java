package com.zachary.mvvmgithub;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.os.Bundle;
import com.zachary.mvvmgithub.databinding.ActivityMainBinding;
import com.zachary.mvvmgithub.model.User;
import com.zachary.mvvmgithub.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final UserViewModel userViewModel = new ViewModelProvider(this).get(UserViewModel.class);


        userViewModel.getUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                if (user!=null){
                    activityMainBinding.setUser(user);
                }
            }
        });

        final SwipeRefreshLayout swipeRefresh = activityMainBinding.swipeRefresh;
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                userViewModel.refresh();
                swipeRefresh.setRefreshing(false);
            }
        });


    }
}