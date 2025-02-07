package com.databricks.sdk.core;

import java.util.Map;
import java.util.function.Supplier;

public interface ConfigResolving {

  default void resolveConfig(DatabricksConfig config, Supplier<Map<String, String>> envGetter) {
    config.resolve(envGetter);
  }
}
