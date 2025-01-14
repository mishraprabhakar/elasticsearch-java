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

package co.elastic.clients.elasticsearch.core.health_report;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.health_report.ShardsCapacityIndicator

/**
 * SHARDS_CAPACITY
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.ShardsCapacityIndicator">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsCapacityIndicator extends BaseIndicator {
	@Nullable
	private final ShardsCapacityIndicatorDetails details;

	// ---------------------------------------------------------------------------------------------

	private ShardsCapacityIndicator(Builder builder) {
		super(builder);

		this.details = builder.details;

	}

	public static ShardsCapacityIndicator of(Function<Builder, ObjectBuilder<ShardsCapacityIndicator>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code details}
	 */
	@Nullable
	public final ShardsCapacityIndicatorDetails details() {
		return this.details;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.details != null) {
			generator.writeKey("details");
			this.details.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsCapacityIndicator}.
	 */

	public static class Builder extends BaseIndicator.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ShardsCapacityIndicator> {
		@Nullable
		private ShardsCapacityIndicatorDetails details;

		/**
		 * API name: {@code details}
		 */
		public final Builder details(@Nullable ShardsCapacityIndicatorDetails value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public final Builder details(
				Function<ShardsCapacityIndicatorDetails.Builder, ObjectBuilder<ShardsCapacityIndicatorDetails>> fn) {
			return this.details(fn.apply(new ShardsCapacityIndicatorDetails.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsCapacityIndicator}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsCapacityIndicator build() {
			_checkSingleUse();

			return new ShardsCapacityIndicator(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsCapacityIndicator}
	 */
	public static final JsonpDeserializer<ShardsCapacityIndicator> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardsCapacityIndicator::setupShardsCapacityIndicatorDeserializer);

	protected static void setupShardsCapacityIndicatorDeserializer(
			ObjectDeserializer<ShardsCapacityIndicator.Builder> op) {
		BaseIndicator.setupBaseIndicatorDeserializer(op);
		op.add(Builder::details, ShardsCapacityIndicatorDetails._DESERIALIZER, "details");

	}

}
