/*
 * Copyright (C) 2016 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.services.preferences;

import android.content.Context;
import androidx.preference.EditTextPreference;
import android.util.AttributeSet;

/**
 * @author mitchellsundt@gmail.com
 */
public class PasswordPreferenceScreen extends EditTextPreference {

   public interface PasswordActionCallback {
      void showPasswordDialog();
   }

   public PasswordActionCallback callback;

   public void setCallback(PasswordActionCallback callback) {
      this.callback = callback;
   }

   public PasswordPreferenceScreen(Context context, AttributeSet attrs, int defStyleAttr) {
      super(context, attrs, defStyleAttr);
   }

   public PasswordPreferenceScreen(Context context, AttributeSet attrs) {
      super(context, attrs);
   }

   public PasswordPreferenceScreen(Context context) {
      super(context);
   }

   @Override protected void onClick() {
      callback.showPasswordDialog();
   }
}
