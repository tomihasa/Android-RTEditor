/*
 * Copyright (C) 2016 Emanuel Moecklin
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

package com.onegravity.rteditor.barcode;

import android.app.Fragment;

/**
 * This event is broadcast via EventBus when the dialog closes.
 * It's received by the RTManager to update the active editor.
 */
public class BarcodeEvent {
    private final String mFragmentTag;
    private final Barcode mBarcode;
    private final boolean mWasCancelled;

    BarcodeEvent(Fragment fragment, Barcode barcode, boolean wasCancelled) {
        mFragmentTag = fragment.getTag();
        mBarcode = barcode;
        mWasCancelled = wasCancelled;
    }

    public String getFragmentTag() {
        return mFragmentTag;
    }

    public Barcode getBarcode() {
        return mBarcode;
    }

    public boolean wasCancelled() {
        return mWasCancelled;
    }
}
