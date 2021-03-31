package me.tergel.annotation.processor

import me.tergel.annotation.Skip
import javax.lang.model.element.Element

private const val TAG = "[UniqueString]:"
fun log(content: String) {
    println(TAG + content)
}

fun Element.isNotAnnotatedWithSkip(): Boolean {
    return !this.isAnnotatedWith(Skip::class.java)
}

fun <T : Annotation> Element?.isAnnotatedWith(
        annotationCls: Class<T>): Boolean {
    return this?.getAnnotation(annotationCls) != null
}

