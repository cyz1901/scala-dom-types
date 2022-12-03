package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait Direction { this: StyleProp[_] =>

  /** Text and other elements go from left to right. */
  lazy val ltr: StyleSetter[_] = this := "ltr"

  /** Text and other elements go from right to left. */
  lazy val rtl: StyleSetter[_] = this := "rtl"

}
