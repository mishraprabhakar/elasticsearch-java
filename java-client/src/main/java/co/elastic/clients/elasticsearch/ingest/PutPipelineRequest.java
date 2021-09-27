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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.put_pipeline.Request
@JsonpDeserializable
public final class PutPipelineRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String timeout;

	@Nullable
	private final Map<String, JsonData> meta;

	@Nullable
	private final String description;

	@Nullable
	private final List<Processor> onFailure;

	@Nullable
	private final List<Processor> processors;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	public PutPipelineRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.meta = builder.meta;
		this.description = builder.description;
		this.onFailure = builder.onFailure;
		this.processors = builder.processors;
		this.version = builder.version;

	}

	/**
	 * ID of the ingest pipeline to create or update.
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * Optional metadata about the ingest pipeline. May have any contents. This map
	 * is not automatically generated by Elasticsearch.
	 * <p>
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Description of the ingest pipeline.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * Processors to run immediately after a processor failure. Each processor
	 * supports a processor-level <code>on_failure</code> value. If a processor
	 * without an <code>on_failure</code> value fails, Elasticsearch uses this
	 * pipeline-level parameter as a fallback. The processors in this parameter run
	 * sequentially in the order specified. Elasticsearch will not attempt to run
	 * the pipeline's remaining processors.
	 * <p>
	 * API name: {@code on_failure}
	 */
	@Nullable
	public List<Processor> onFailure() {
		return this.onFailure;
	}

	/**
	 * Processors used to perform transformations on documents before indexing.
	 * Processors run sequentially in the order specified.
	 * <p>
	 * API name: {@code processors}
	 */
	@Nullable
	public List<Processor> processors() {
		return this.processors;
	}

	/**
	 * Version number used by external systems to track ingest pipelines. This
	 * parameter is intended for external systems only. Elasticsearch does not use
	 * or validate pipeline version numbers.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
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

		if (this.meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.onFailure != null) {

			generator.writeKey("on_failure");
			generator.writeStartArray();
			for (Processor item0 : this.onFailure) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.processors != null) {

			generator.writeKey("processors");
			generator.writeStartArray();
			for (Processor item0 : this.processors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPipelineRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutPipelineRequest> {
		private String id;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String timeout;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private String description;

		@Nullable
		private List<Processor> onFailure;

		@Nullable
		private List<Processor> processors;

		@Nullable
		private Long version;

		/**
		 * ID of the ingest pipeline to create or update.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Optional metadata about the ingest pipeline. May have any contents. This map
		 * is not automatically generated by Elasticsearch.
		 * <p>
		 * API name: {@code _meta}
		 */
		public Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder put_meta(String key, JsonData value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		/**
		 * Description of the ingest pipeline.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Processors to run immediately after a processor failure. Each processor
		 * supports a processor-level <code>on_failure</code> value. If a processor
		 * without an <code>on_failure</code> value fails, Elasticsearch uses this
		 * pipeline-level parameter as a fallback. The processors in this parameter run
		 * sequentially in the order specified. Elasticsearch will not attempt to run
		 * the pipeline's remaining processors.
		 * <p>
		 * API name: {@code on_failure}
		 */
		public Builder onFailure(@Nullable List<Processor> value) {
			this.onFailure = value;
			return this;
		}

		/**
		 * Processors to run immediately after a processor failure. Each processor
		 * supports a processor-level <code>on_failure</code> value. If a processor
		 * without an <code>on_failure</code> value fails, Elasticsearch uses this
		 * pipeline-level parameter as a fallback. The processors in this parameter run
		 * sequentially in the order specified. Elasticsearch will not attempt to run
		 * the pipeline's remaining processors.
		 * <p>
		 * API name: {@code on_failure}
		 */
		public Builder onFailure(Processor... value) {
			this.onFailure = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #onFailure(List)}, creating the list if needed.
		 */
		public Builder addOnFailure(Processor value) {
			if (this.onFailure == null) {
				this.onFailure = new ArrayList<>();
			}
			this.onFailure.add(value);
			return this;
		}

		/**
		 * Set {@link #onFailure(List)} to a singleton list.
		 */
		public Builder onFailure(Function<Processor.Builder, ObjectBuilder<Processor>> fn) {
			return this.onFailure(fn.apply(new Processor.Builder()).build());
		}

		/**
		 * Add a value to {@link #onFailure(List)}, creating the list if needed.
		 */
		public Builder addOnFailure(Function<Processor.Builder, ObjectBuilder<Processor>> fn) {
			return this.addOnFailure(fn.apply(new Processor.Builder()).build());
		}

		/**
		 * Processors used to perform transformations on documents before indexing.
		 * Processors run sequentially in the order specified.
		 * <p>
		 * API name: {@code processors}
		 */
		public Builder processors(@Nullable List<Processor> value) {
			this.processors = value;
			return this;
		}

		/**
		 * Processors used to perform transformations on documents before indexing.
		 * Processors run sequentially in the order specified.
		 * <p>
		 * API name: {@code processors}
		 */
		public Builder processors(Processor... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(Processor value) {
			if (this.processors == null) {
				this.processors = new ArrayList<>();
			}
			this.processors.add(value);
			return this;
		}

		/**
		 * Set {@link #processors(List)} to a singleton list.
		 */
		public Builder processors(Function<Processor.Builder, ObjectBuilder<Processor>> fn) {
			return this.processors(fn.apply(new Processor.Builder()).build());
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(Function<Processor.Builder, ObjectBuilder<Processor>> fn) {
			return this.addProcessors(fn.apply(new Processor.Builder()).build());
		}

		/**
		 * Version number used by external systems to track ingest pipelines. This
		 * parameter is intended for external systems only. Elasticsearch does not use
		 * or validate pipeline version numbers.
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link PutPipelineRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPipelineRequest build() {

			return new PutPipelineRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutPipelineRequest}
	 */
	public static final JsonpDeserializer<PutPipelineRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutPipelineRequest::setupPutPipelineRequestDeserializer, Builder::build);

	protected static void setupPutPipelineRequestDeserializer(DelegatingDeserializer<PutPipelineRequest.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::onFailure, JsonpDeserializer.arrayDeserializer(Processor._DESERIALIZER), "on_failure");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(Processor._DESERIALIZER), "processors");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.put_pipeline}".
	 */
	public static final Endpoint<PutPipelineRequest, PutPipelineResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/pipeline");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutPipelineResponse._DESERIALIZER);
}
