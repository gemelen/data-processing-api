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

package net.gemelen.data.processing.api.parsing

sealed abstract class ParsingError

final class UnknownFormat(message: String) extends ParsingError
final class UparsableData(message: String) extends ParsingError
