package org.buildmlearn.toolkit.model;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import org.buildmlearn.toolkit.R;

/**
 * Created by Abhishek on 23-05-2015.
 */
public enum Template {

    BASIC_M_LEARNING(R.string.basic_m_learning_title, R.string.basic_m_learning_description, R.drawable.basic_m_learning),
    LEARN_SPELLING(R.string.learn_spellings_title, R.string.learn_spellings_description, R.drawable.basic_m_learning),
    QUIZ(R.string.quiz_title, R.string.quiz_description, R.drawable.basic_m_learning),
    FLASH_CARD(R.string.flash_card_title, R.string.flash_card_description, R.drawable.basic_m_learning);

    private @DrawableRes int image;
    private @StringRes int title;
    private @StringRes int description;

    Template(@StringRes int title, @StringRes int description, @DrawableRes int image) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public int getTitle() {
        return title;
    }

    public int getDescription() {
        return description;
    }
}