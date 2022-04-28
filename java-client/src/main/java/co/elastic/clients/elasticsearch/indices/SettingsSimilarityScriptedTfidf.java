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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.SettingsSimilarityScriptedTfidf

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityScriptedTfidf">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityScriptedTfidf implements JsonpSerializable {
	private final Script script;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityScriptedTfidf(Builder builder) {

		this.script = ApiTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static SettingsSimilarityScriptedTfidf of(
			Function<Builder, ObjectBuilder<SettingsSimilarityScriptedTfidf>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final Script script() {
		return this.script;
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

		generator.writeKey("script");
		this.script.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarityScriptedTfidf}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarityScriptedTfidf> {
		private Script script;

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarityScriptedTfidf}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarityScriptedTfidf build() {
			_checkSingleUse();

			return new SettingsSimilarityScriptedTfidf(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarityScriptedTfidf}
	 */
	public static final JsonpDeserializer<SettingsSimilarityScriptedTfidf> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarityScriptedTfidf::setupSettingsSimilarityScriptedTfidfDeserializer);

	protected static void setupSettingsSimilarityScriptedTfidfDeserializer(
			ObjectDeserializer<SettingsSimilarityScriptedTfidf.Builder> op) {

		op.add(Builder::script, Script._DESERIALIZER, "script");

	}

}
