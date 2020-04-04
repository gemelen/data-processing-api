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

package net.gemelen.data.processing.api

import java.time.Instant

trait Event[T] {

  def timestamp: Instant
  def body: Map[String, T]

  def apply(field: String): Option[T] = body.get(field)
}
