package org.jumpmind.metl.core.persist;

import java.util.List;

public interface IImportExportService {
    
    public void addConfigurationChangeListener(IConfigurationChangedListener listener);
    
    public void importConfiguration(String dataToImport, String userId);
    
    public String exportProjectVersion(String projectVersionId, String userdId);
    
    public String exportFlows(String projectVersionId, List<String> flowIds, List<String> modelIds, List<String> resoruceIds, String userId);
    
    public String exportReleasePackage(String releasePackageId, String userId);
    
    public String exportAgent(String agentId, String userId);

}
