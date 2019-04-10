/*
 * Copyright IBM Corp. 2019
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.bluemix.connectors.core.info;

import org.springframework.cloud.service.BaseServiceInfo;

public class DatabasesForRedisServiceInfo extends BaseServiceInfo {
    private byte[] certData;
    private String host;
    private String port;
    private String password;
    private String scheme;

    public DatabasesForRedisServiceInfo(String id, byte[] certData, String host, String port, String password,
            String scheme) {
        super(id);
        this.certData = certData;
        this.host = host;
        this.port = port;
        this.password = password;
        this.scheme = scheme;
    }

    public byte[] getCertData() {
        return this.certData;
    }

    public String getHost() {
        return this.host;
    }

    public String getPort() {
        return this.port;
    }

    public String getPassword() {
        return this.password;
    }

    public String getScheme() {
        return this.scheme;
    }
}