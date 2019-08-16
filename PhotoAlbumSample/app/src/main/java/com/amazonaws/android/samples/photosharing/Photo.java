/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.android.samples.photosharing;

import android.graphics.Bitmap;

/**
 * Defines Photo class.
 */
public class Photo {
    // Id generated by AppSync
    private String photoId;
    // photo file name
    private String name;
    // the bucket which the photo stores in
    private String bucket;
    // key in the bucket
    private String key;
    // photo file in Bitmap format
    private Bitmap file;

    /**
     * Constructor of Photo object.
     * @param photoId
     * @param name
     * @param bucket
     * @param key
     * @param file
     */
    public Photo(String photoId, String name, String bucket, String key, Bitmap file) {
        this.photoId = photoId;
        this.name = name;
        this.bucket = bucket;
        this.key = key;
        this.file = file;
    }

    public String getPhotoId() {
        return this.photoId;
    }

    public String getName() {
        return this.name;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getKey() {
        return this.key;
    }

    public Bitmap getPhoto(){ return this.file; }

}