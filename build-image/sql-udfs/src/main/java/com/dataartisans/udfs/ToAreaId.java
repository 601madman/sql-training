/*
 * Copyright 2018 data Artisans GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dataartisans.udfs;

import org.apache.flink.table.functions.ScalarFunction;

import com.dataartisans.udfs.util.GeoUtils;

/**
 * Table API / SQL Scalar UDF to convert a lon/lat pair into a cell ID.
 */
public class ToAreaId extends ScalarFunction {

	public int eval(float lon, float lat) {
		return GeoUtils.mapToGridCell(lon, lat);
	}
}
