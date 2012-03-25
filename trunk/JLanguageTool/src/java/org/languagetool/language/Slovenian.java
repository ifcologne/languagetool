/* LanguageTool, a natural language style checker 
 * Copyright (C) 2007 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.language;

import java.util.*;

import org.languagetool.Language;
import org.languagetool.rules.*;
import org.languagetool.tokenizers.SRXSentenceTokenizer;
import org.languagetool.tokenizers.SentenceTokenizer;

public class Slovenian extends Language {
  
  private SentenceTokenizer sentenceTokenizer;
  
  @Override
  public Locale getLocale() {
    return new Locale(getShortName());
  }

  @Override
  public String getName() {
    return "Slovenian";
  }

  @Override
  public String getShortName() {
    return "sl";
  }
  
  @Override
  public String[] getCountryVariants() {
    return new String[]{"SI"};
  }

  @Override
  public String[] getUnpairedRuleStartSymbols() {
    return new String[]{ "[", "(", "{", "„", "»", "«", "\"" };
  }

  @Override
  public String[] getUnpairedRuleEndSymbols() {
    return new String[]{ "]", ")", "}", "”", "«", "»", "\"" };
  }
  
  @Override
  public SentenceTokenizer getSentenceTokenizer() {
    if (sentenceTokenizer == null) {
      sentenceTokenizer = new SRXSentenceTokenizer(getShortName());
    }
    return sentenceTokenizer;
  }
  
  @Override
  public Contributor[] getMaintainers() {
    return new Contributor[] {new Contributor("Martin Srebotnjak")};
  }

  @Override
  public List<Class<? extends Rule>> getRelevantRules() {
    return Arrays.asList(
            CommaWhitespaceRule.class,
            DoublePunctuationRule.class,
            GenericUnpairedBracketsRule.class,
            UppercaseSentenceStartRule.class,
            WordRepeatRule.class,
            WhitespaceRule.class
    );
  }

}
