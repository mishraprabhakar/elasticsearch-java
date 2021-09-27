/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationRegressionMetricsHuber
@JsonpDeserializable
public final class DataframeEvaluationRegressionMetricsHuber implements JsonpSerializable {
	@Nullable
	private final Double delta;

	// ---------------------------------------------------------------------------------------------

	public DataframeEvaluationRegressionMetricsHuber(Builder builder) {

		this.delta = builder.delta;

	}

	/**
	 * Approximates 1/2 (prediction - actual)2 for values much less than delta and
	 * approximates a straight line with slope delta for values much larger than
	 * delta. Defaults to 1. Delta needs to be greater than 0.
	 * <p>
	 * API name: {@code delta}
	 */
	@Nullable
	public Double delta() {
		return this.delta;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.delta != null) {

			generator.writeKey("delta");
			generator.write(this.delta);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationRegressionMetricsHuber}.
	 */
	public static class Builder implements ObjectBuilder<DataframeEvaluationRegressionMetricsHuber> {
		@Nullable
		private Double delta;

		/**
		 * Approximates 1/2 (prediction - actual)2 for values much less than delta and
		 * approximates a straight line with slope delta for values much larger than
		 * delta. Defaults to 1. Delta needs to be greater than 0.
		 * <p>
		 * API name: {@code delta}
		 */
		public Builder delta(@Nullable Double value) {
			this.delta = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationRegressionMetricsHuber}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationRegressionMetricsHuber build() {

			return new DataframeEvaluationRegressionMetricsHuber(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationRegressionMetricsHuber}
	 */
	public static final JsonpDeserializer<DataframeEvaluationRegressionMetricsHuber> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeEvaluationRegressionMetricsHuber::setupDataframeEvaluationRegressionMetricsHuberDeserializer,
					Builder::build);

	protected static void setupDataframeEvaluationRegressionMetricsHuberDeserializer(
			DelegatingDeserializer<DataframeEvaluationRegressionMetricsHuber.Builder> op) {

		op.add(Builder::delta, JsonpDeserializer.doubleDeserializer(), "delta");

	}

}
