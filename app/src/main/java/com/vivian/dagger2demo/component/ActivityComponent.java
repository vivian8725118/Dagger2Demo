package com.vivian.dagger2demo.component;

import com.vivian.dagger2demo.module.ActivityModule;
import com.vivian.dagger2demo.MainActivity;

import dagger.Component;

/**
 * *          _       _
 * *   __   _(_)_   _(_) __ _ _ __
 * *   \ \ / / \ \ / / |/ _` | '_ \
 * *    \ V /| |\ V /| | (_| | | | |
 * *     \_/ |_| \_/ |_|\__,_|_| |_|
 * <p>
 * Created by vivian on 16/6/22.
 */
@Component(
        modules=ActivityModule.class
)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
