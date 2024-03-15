package com.example.desapp008.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.desapp008.earthquakes.Earthquake;
import com.squareup.moshi.Json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Properties {
    @Json(name="mag")

    private double magnitude;
    private String place;
    private long time;

    public double getMagnitude(){
        return magnitude;
    }

    public String getPlace(){
        return place;
    }

    public long getTime(){
        return time;
    }



}
