<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>data driven test with internal data source</description>
   <name>DDT_TC_Cura_login_InternalData</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>74ceb6c9-04bb-4643-896b-82d3fa0c7b41</testSuiteGuid>
   <testCaseLink>
      <guid>c5786d7b-5509-45b4-9887-4b4c63e17944</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Driven Test/DDT_TC_Cura_Login_001</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>5f0c6844-9783-4ead-967c-cb3fd010d141</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Test Data/TestData_Internal_login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>5f0c6844-9783-4ead-967c-cb3fd010d141</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>db50f3b8-c5aa-49ed-8434-ac7a9aaf30ce</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5f0c6844-9783-4ead-967c-cb3fd010d141</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>b6b284ab-77a7-4ef9-a467-88263a825a02</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
