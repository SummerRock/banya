package com.forezp.banya.viewinterface.film;

import com.forezp.banya.base.IBaseView;
import com.forezp.banya.bean.filecomingsoon.FilmComingSoon;

/**
 * Created by XIAYAN on 2017/2/19.
 */

public interface IgetFilmComingView extends IBaseView {
    void getFilmComingSuccess(FilmComingSoon filmComingSoon);

    /**
     * 网络请求失败
     */
    void getDataFail();
}
