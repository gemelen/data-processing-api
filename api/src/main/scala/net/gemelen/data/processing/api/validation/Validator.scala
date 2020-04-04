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

package net.gemelen.data.processing.api.validation

import cats.data.Validated
import net.gemelen.data.processing.api.Event

trait Validator[T] {

  def validate(event: Event[T]): Validated[ValidationError, Event[T]]

}
