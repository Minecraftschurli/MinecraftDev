/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2023 minecraft-dev
 *
 * MIT License
 */

package com.demonwav.mcdev.translations.lang.psi

import com.demonwav.mcdev.translations.lang.MCLangLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class LangTokenType(@NonNls debugName: String) : IElementType(debugName, MCLangLanguage)
