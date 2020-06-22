package io.armory.plugin.observability.service;

import io.armory.plugin.observability.model.PluginConfig;
import io.armory.plugin.observability.model.PluginMetricsConfig;
import io.micrometer.core.instrument.config.MeterFilter;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * https://micrometer.io/docs/concepts#_denyaccept_meters
 *
 * <p>A service that will provide our filters and transformers to configure / customize metrics to
 * be more efficient for metrics platforms that care about the number of unique MTS and or DPM.
 */
@Slf4j
public class MeterFilterService {

  private final PluginMetricsConfig metricsConfig;

  public MeterFilterService(PluginConfig pluginConfig) {
    metricsConfig = pluginConfig.getMetrics();
  }

  /**
   * TODO, pattern for impl TBD.
   *
   * @return The list of enabled filters.
   */
  public List<MeterFilter> getMeterFilters() {
    return List.of();
  }
}
