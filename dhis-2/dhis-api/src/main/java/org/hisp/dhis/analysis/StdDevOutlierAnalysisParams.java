package org.hisp.dhis.analysis;

/*
 * Copyright (c) 2004-2018, University of Oslo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * Neither the name of the HISP project nor the names of its contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.util.List;

public class StdDevOutlierAnalysisParams
{
    private String fromDate;

    private String toDate;

    private List<String> dataSetIds;

    private Double standardDeviation;

    private String organisationUnitId;

    public StdDevOutlierAnalysisParams()
    {
    }

    public StdDevOutlierAnalysisParams( String fromDate, String toDate, List<String> dataSetIds,
        Double standardDeviation, String organisationUnitId )
    {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.dataSetIds = dataSetIds;
        this.standardDeviation = standardDeviation;
        this.organisationUnitId = organisationUnitId;
    }

    public String getFromDate()
    {
        return fromDate;
    }

    public void setFromDate( String fromDate )
    {
        this.fromDate = fromDate;
    }

    public String getToDate()
    {
        return toDate;
    }

    public void setToDate( String toDate )
    {
        this.toDate = toDate;
    }

    public List<String> getDataSetIds()
    {
        return dataSetIds;
    }

    public void setDataSetIds( List<String> dataSetIds )
    {
        this.dataSetIds = dataSetIds;
    }

    public Double getStandardDeviation()
    {
        return standardDeviation;
    }

    public void setStandardDeviation( Double standardDeviation )
    {
        this.standardDeviation = standardDeviation;
    }

    public String getOrganisationUnitId()
    {
        return organisationUnitId;
    }

    public void setOrganisationUnitId( String organisationUnitId )
    {
        this.organisationUnitId = organisationUnitId;
    }
}
