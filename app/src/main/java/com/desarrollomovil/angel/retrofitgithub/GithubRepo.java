package com.desarrollomovil.angel.retrofitgithub;

/**
 * Created by angel on 27/01/2017.
 */
public class GithubRepo {

    String name;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}
