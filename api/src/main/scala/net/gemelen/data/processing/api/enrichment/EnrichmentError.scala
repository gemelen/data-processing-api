/*
 * Data Platform / Data processing API
 *
 * Copyright Denis Pyshev
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package net.gemelen.data.processing.api.enrichment

sealed abstract class EnrichmentError

final class LogicalMismatch(message: String) extends EnrichmentError
