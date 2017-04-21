package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.CommentApi

trait Comment[N, DomComment <: DomNode, DomNode] extends Node[N, DomComment, DomNode] { this: N =>

  val commentApi: CommentApi[N, DomComment]

  protected[this] var _text: String

  @inline def text: String = _text

  override protected[this] def createRef(): DomComment = {
    commentApi.createComment(_text)
  }
}
