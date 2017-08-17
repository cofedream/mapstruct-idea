/*
 *  Copyright 2017 the MapStruct authors (http://www.mapstruct.org/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.intellij.codeinsight.references;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiLiteral;

/**
 * Cretor of {@link MapstructBaseReference}.
 *
 * @param <T> the type of the reference that would be created
 *
 * @author Filip Hrisafov
 */
@FunctionalInterface
interface ReferenceCreator<T extends MapstructBaseReference> {

    /**
     * Create a new reference from the provided parameters.
     *
     * @param psiLiteral the element that the reference belongs to
     * @param previousReference the previous reference if there is one (in nested properties for example)
     * @param rangeInElement the range that the reference represent in the {@code psiLiteral}
     *
     * @return a new reference created from the provided parameters
     */
    T create(PsiLiteral psiLiteral, T previousReference, TextRange rangeInElement);
}
