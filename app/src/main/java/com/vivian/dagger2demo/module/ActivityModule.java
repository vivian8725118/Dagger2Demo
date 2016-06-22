package com.vivian.dagger2demo.module;

import com.vivian.dagger2demo.model.CompanyModel;
import com.vivian.dagger2demo.model.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * *          _       _
 * *   __   _(_)_   _(_) __ _ _ __
 * *   \ \ / / \ \ / / |/ _` | '_ \
 * *    \ V /| |\ V /| | (_| | | | |
 * *     \_/ |_| \_/ |_|\__,_|_| |_|
 * <p>
 * Created by vivian on 16/6/22.
 */
@Module
public class ActivityModule {

    @Provides
    public UserModel provideUserModel(){
        return new UserModel("1","hjx","man");
    }

    @Provides
    public CompanyModel provideCompanyModel(){
        return new CompanyModel("钛媒体","1231231","呼家楼");
    }
}
