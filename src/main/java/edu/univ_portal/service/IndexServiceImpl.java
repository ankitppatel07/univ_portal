package edu.univ_portal.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl {

    private static final Logger logger = LogManager.getLogger(IndexServiceImpl.class);

    
    public String getTestDataService() {
        logger.info("Inside IndexServiceImpl -> getTestDataService()");
        
        JSONObject obj = new JSONObject();
        obj.put("testData", "Ankit Patel");
        
        logger.info("Inside IndexServiceImpl -> getTestDataService()");
        return obj.toString();
    }
    
    
}
