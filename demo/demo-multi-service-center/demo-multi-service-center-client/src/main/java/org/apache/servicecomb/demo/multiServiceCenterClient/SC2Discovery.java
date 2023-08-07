/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.servicecomb.demo.multiServiceCenterClient;

import org.apache.servicecomb.registry.sc.SCConfigurationProperties;
import org.apache.servicecomb.registry.sc.SCConst;
import org.apache.servicecomb.registry.sc.SCDiscovery;
import org.apache.servicecomb.service.center.client.ServiceCenterClient;

public class SC2Discovery extends SCDiscovery {
  public SC2Discovery(SCConfigurationProperties configurationProperties,
      ServiceCenterClient serviceCenterClient) {
    super(configurationProperties, serviceCenterClient);
  }

  @Override
  public String name() {
    return SCConst.SC_REGISTRY_NAME + "2";
  }
}
