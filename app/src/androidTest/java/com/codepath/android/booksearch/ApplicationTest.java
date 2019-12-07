package com.codepath.android.booksearch;

import android.app.Activity;

import android.support.test.rule.ActivityTestRule;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityTestRule<Activity> {
    public ApplicationTest() {
        super(Activity.class);
    }
}