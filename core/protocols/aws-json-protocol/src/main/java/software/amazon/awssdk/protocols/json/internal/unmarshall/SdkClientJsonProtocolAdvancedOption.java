/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package software.amazon.awssdk.protocols.json.internal.unmarshall;

import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.core.client.config.ClientOption;

@SdkInternalApi
public class SdkClientJsonProtocolAdvancedOption<T> extends ClientOption<T> {
    /**
     * Enables the fast unmarshall code path. This option is internal and subject to removal in future releases of the SDK.
     */
    public static final SdkClientJsonProtocolAdvancedOption<Boolean> ENABLE_FAST_UNMARSHALLER =
        new SdkClientJsonProtocolAdvancedOption<>(Boolean.class);

    protected SdkClientJsonProtocolAdvancedOption(Class<T> valueClass) {
        super(valueClass);
    }
}