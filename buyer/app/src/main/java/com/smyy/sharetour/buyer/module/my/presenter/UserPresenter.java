package com.smyy.sharetour.buyer.module.my.presenter;

import com.smyy.sharetour.buyer.module.my.bean.UserInfoBean;
import com.smyy.sharetour.buyer.module.my.contract.IUserContract;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class UserPresenter extends IUserContract.Presenter {
    public UserPresenter(IUserContract.View view, IUserContract.Model model) {
        super(view, model);
    }

    @Override
    public void getUserInfoFromNet() {
        Observable.create(new ObservableOnSubscribe<UserInfoBean>() {
            @Override
            public void subscribe(ObservableEmitter<UserInfoBean> e) throws Exception {
                if (mModel != null) {
                    UserInfoBean userInfo = mModel.getUserInfoFromNet();
                    e.onNext(userInfo);
                    e.onComplete();
                }

            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserInfoBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        if (mView != null) {
                            mView.showProgressDialog();
                        }
                    }

                    @Override
                    public void onNext(UserInfoBean userInfo) {
                        mView.showUserInfo(userInfo);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        if (mView != null) {
                            mView.hideProgressDialog();
                        }
                    }
                });

    }

    @Override
    public void getUserInfo() {
        Observable.create(new ObservableOnSubscribe<UserInfoBean>() {
            @Override
            public void subscribe(ObservableEmitter<UserInfoBean> e) throws Exception {
                if (mModel != null) {
                    UserInfoBean userInfo = mModel.getUserInfo();
                    e.onNext(userInfo);
                    e.onComplete();
                }

            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserInfoBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(UserInfoBean userInfo) {
                        if (mView != null) {
                            mView.showUserInfo(userInfo);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

    @Override
    public void setUserName(final String userName) {
        Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(ObservableEmitter<Boolean> e) throws Exception {
                if (mModel != null) {
                    boolean result = mModel.setUserName(userName);
                    e.onNext(result);
                    e.onComplete();
                }

            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        if (mView != null) {
                            mView.showProgressDialog();
                        }
                    }

                    @Override
                    public void onNext(Boolean result) {
                        if (mView != null) {
                            if (result) {
                                mView.editUserInfoSuccess();
                            } else {
                                mView.editUserInfoFail();
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        if (mView != null) {
                            mView.hideProgressDialog();
                        }
                    }
                });
    }

    @Override
    public void setUserIntro(final String userIntro) {
        Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(ObservableEmitter<Boolean> e) throws Exception {
                if (mModel != null) {
                    boolean result = mModel.setUserIntro(userIntro);
                    e.onNext(result);
                    e.onComplete();
                }

            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        if (mView != null) {
                            mView.showProgressDialog();
                        }
                    }

                    @Override
                    public void onNext(Boolean result) {
                        if (mView != null) {
                            if (result) {
                                mView.editUserInfoSuccess();
                            } else {
                                mView.editUserInfoFail();
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        if (mView != null) {
                            mView.hideProgressDialog();
                        }
                    }
                });

    }

    @Override
    public void setAvatar(final String avatar) {
        Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(ObservableEmitter<Boolean> e) throws Exception {
                if (mModel != null) {
                    boolean result = mModel.setUserAvatar(avatar);
                    e.onNext(result);
                    e.onComplete();
                }

            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        if (mView != null) {
                            mView.showProgressDialog();
                        }
                    }

                    @Override
                    public void onNext(Boolean result) {
                        if (mView != null) {
                            if (result) {
                                mView.editUserInfoSuccess();
                            } else {
                                mView.editUserInfoFail();
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        if (mView != null) {
                            mView.hideProgressDialog();
                        }
                    }
                });
    }

    @Override
    public void setUsualDest(final List<String> usualDestList) {
        Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(ObservableEmitter<Boolean> e) throws Exception {
                if (mModel != null) {
                    boolean result = mModel.setUsualDest(usualDestList);
                    e.onNext(result);
                    e.onComplete();
                }

            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        if (mView != null) {
                            mView.showProgressDialog();
                        }
                    }

                    @Override
                    public void onNext(Boolean result) {
                        if (mView != null) {
                            if (result) {
                                mView.editUserInfoSuccess();
                            } else {
                                mView.editUserInfoFail();
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        if (mView != null) {
                            mView.hideProgressDialog();
                        }
                    }
                });
    }
}
