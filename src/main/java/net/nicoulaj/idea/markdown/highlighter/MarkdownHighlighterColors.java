/*
 * Copyright (c) 2011 Julien Nicoulaud <julien.nicoulaud@gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package net.nicoulaj.idea.markdown.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;

import java.awt.*;

/**
 * The default styles for each of token defined for Markdown.
 *
 * @author Julien Nicoulaud <julien.nicoulaud@gmail.com>
 * @since 0.1
 */
public class MarkdownHighlighterColors {

    /**
     * Default style for plain text.
     */
    public static TextAttributesKey PLAIN_TEXT_ATTR_KEY = TextAttributesKey.createTextAttributesKey(
            "MARKDOWN.PLAIN_TEXT", new TextAttributes(new Color(0, 0, 0), null, null, null, Font.PLAIN)
    );

    /**
     * Default style for bold text.
     */
    public static TextAttributesKey BOLD_TEXT_ATTR_KEY = TextAttributesKey.createTextAttributesKey(
            "MARKDOWN.BOLD_TEXT", new TextAttributes(new Color(0, 0, 0), null, null, null, Font.BOLD)
    );

    /**
     * Default style for italic text.
     */
    public static TextAttributesKey ITALIC_TEXT_ATTR_KEY = TextAttributesKey.createTextAttributesKey(
            "MARKDOWN.ITALIC_TEXT", new TextAttributes(new Color(0, 0, 0), null, null, null, Font.ITALIC)
    );

    /**
     * Default style for links.
     */
    public static TextAttributesKey LINK_ATTR_KEY = TextAttributesKey.createTextAttributesKey(
            "MARKDOWN.LINK", new TextAttributes(new Color(0, 0, 255), null, null, null, Font.PLAIN)
    );

    /**
     * Default style for images.
     */
    public static TextAttributesKey IMAGE_CHARACTER_ATTR_KEY = TextAttributesKey.createTextAttributesKey(
            "MARKDOWN.IMAGE", new TextAttributes(new Color(70, 110, 0), null, null, null, Font.PLAIN)
    );
}
