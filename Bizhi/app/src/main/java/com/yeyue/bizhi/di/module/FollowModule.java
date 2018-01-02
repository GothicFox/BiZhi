package com.yeyue.bizhi.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.yeyue.bizhi.contract.FollowContract;
import com.yeyue.bizhi.model.FollowModel;


@Module
public class FollowModule {
    private FollowContract.View view;

    /**
     * 构建FollowModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public FollowModule(FollowContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    FollowContract.View provideFollowView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    FollowContract.Model provideFollowModel(FollowModel model) {
        return model;
    }
}