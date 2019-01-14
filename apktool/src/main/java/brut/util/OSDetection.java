/**
 * Copyright (C) 2018 Ryszard Wiśniewski <brut.alll@gmail.com>
 * Copyright (C) 2018 Connor Tumbleson <connor.tumbleson@gmail.com>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package brut.util;

import android.os.Build;

public class OSDetection {
    private static String[] abis = Build.SUPPORTED_ABIS;


    public static boolean isArm() {
        return Build.SUPPORTED_32_BIT_ABIS.length != 0;
    }

    public static boolean isArm64() {
        return Build.SUPPORTED_64_BIT_ABIS.length != 0;
    }

    public static String returnOS() {
        return null;
    }
}
