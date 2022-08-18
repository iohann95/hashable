/**
 *    Copyright 2011 Tribloom
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package br.com.dgcloud.hashable.model;

import org.alfresco.service.namespace.QName;

public interface HashableModel {
	static final String HASH_URI = "http://www.tribloom.com/model/hashable/1.0";
	static final QName ASPECT_HASHABLE = QName.createQName(HASH_URI, "hashable");
	static final QName PROP_HASH_TYPE = QName.createQName(HASH_URI, "hashType");
	static final QName PROP_HASH_VALUE = QName.createQName(HASH_URI, "hashValue");
}
