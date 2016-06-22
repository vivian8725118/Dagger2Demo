package com.vivian.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.vivian.dagger2demo.component.ActivityComponent;
import com.vivian.dagger2demo.component.DaggerActivityComponent;
import com.vivian.dagger2demo.model.CompanyModel;
import com.vivian.dagger2demo.model.UserModel;
import com.vivian.dagger2demo.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private ActivityComponent mActivityComponent;

    @Inject
    UserModel mUserModel;//不能为 private

    @Inject
    CompanyModel mCompanyModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActivityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        mActivityComponent.inject(this);

        ((TextView) findViewById(R.id.text)).setText(
                "ID:" + mUserModel.getId() +
                        "\n Name:" + mUserModel.getName() +
                        "\n Gender:" + mUserModel.getGender() +
                        "\n Company:" + mCompanyModel.getName()
                        + "\n Company PhoneNumber:" + mCompanyModel.getPhoneNumber()
                        + "\n Company Address:" + mCompanyModel.getAddress());

    }
}
