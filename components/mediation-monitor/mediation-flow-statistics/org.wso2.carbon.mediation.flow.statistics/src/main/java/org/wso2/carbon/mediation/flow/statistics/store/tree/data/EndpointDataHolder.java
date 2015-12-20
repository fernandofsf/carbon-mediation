/*
 *   Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.mediation.flow.statistics.store.tree.data;

import org.apache.synapse.aspects.newstatistics.EndpointStatisticLog;
import org.wso2.carbon.mediation.flow.statistics.service.data.TreeNodeData;

public class EndpointDataHolder {

	IndividualStatistic endpointStatistics;

	public EndpointDataHolder(EndpointStatisticLog endpointStatisticLog) {
		this.endpointStatistics = new IndividualStatistic(endpointStatisticLog);
	}

	public void update(EndpointStatisticLog endpointStatisticLog){
		this.endpointStatistics.update(endpointStatisticLog);
	}

	public TreeNodeData getInfo() {
		return endpointStatistics.getTreeNodeData();
	}
}
