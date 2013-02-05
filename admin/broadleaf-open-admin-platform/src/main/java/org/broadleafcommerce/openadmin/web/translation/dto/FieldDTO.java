/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.openadmin.web.translation.dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Elbert Bautista (elbertbautista)
 */
public class FieldDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String label;

    protected String name;

    protected ArrayList<OptionsDTO> options = new ArrayList<OptionsDTO>();

    protected ArrayList<OperatorDTO> operators = new ArrayList<OperatorDTO>();

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<OptionsDTO> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<OptionsDTO> options) {
        this.options = options;
    }

    public ArrayList<OperatorDTO> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList<OperatorDTO> operators) {
        this.operators = operators;
    }
}
