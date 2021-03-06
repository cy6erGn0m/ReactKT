/*
 * Copyright 2015 Yann Le Moigne
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.javatic.reactkt.material.components

class TextareaProps(
        val cols: Int? = null,
        val rows: Int? = null,
        val defaultValue: String? = null,
        className: String? = null,
        id: String? = null,
        label: String? = null,
        floatingLabel: Boolean? = null,
        error: String? = null,
        expandable: Boolean? = null,
        button: Boolean? = null,
        icon: Boolean? = null,
        expandableHolder: Boolean? = null
) : AbstractInputfieldProps(className, id, label, floatingLabel, error, expandable, button, icon, expandableHolder)