/*
 * Copyright 2014 Kevin Zetterstrom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.metrico.trailerparkboyssoundboard.dto;

public class Sound {
    private String mDescription = "";
    private String mAssetDescription = "";
    private int mSoundResourceId = -1;

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setAssetDescription(String description) {
        mAssetDescription = description;
    }

    public String getAssetDescription() {
        return mAssetDescription;
    }

    public void setSoundResourceId(int id) {
        mSoundResourceId = id;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

}