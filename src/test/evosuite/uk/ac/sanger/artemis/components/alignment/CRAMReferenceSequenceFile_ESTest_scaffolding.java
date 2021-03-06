/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Sep 20 13:34:47 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CRAMReferenceSequenceFile_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.dir", "/Users/kp11/workspace/applications/Artemis-build-ci/Artemis"); 
    java.lang.System.setProperty("user.home", "/Users/kp11"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "kp11"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CRAMReferenceSequenceFile_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.alignment.SnpPanel",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.apache.log4j.DefaultCategoryFactory",
      "htsjdk.samtools.cram.ref.CRAMReferenceSource",
      "org.apache.log4j.or.RendererMap",
      "htsjdk.samtools.reference.ReferenceSequenceFile",
      "uk.ac.sanger.artemis.components.alignment.SAMRecordMapQPredicate",
      "uk.ac.sanger.artemis.components.alignment.ReadGroupsFrame",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.alignment.PopupMessageFrame",
      "htsjdk.samtools.util.CloseableIterator",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.components.alignment.BamFrame",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.components.alignment.SAMRecordPredicate",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "org.apache.log4j.spi.RootLogger",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.components.alignment.BamView$Ruler",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.util.FileDocument",
      "htsjdk.samtools.seekablestream.SeekableStream",
      "uk.ac.sanger.artemis.components.alignment.GroupBamFrame",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.components.alignment.CoveragePanel",
      "org.apache.log4j.helpers.OptionConverter",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.components.SequenceComboBox",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.util.FTPSeekableStream",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "htsjdk.samtools.SAMException",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "org.apache.log4j.spi.RepositorySelector",
      "htsjdk.samtools.SAMRecord",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.components.alignment.BamViewRecord",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "htsjdk.samtools.reference.ReferenceSequence",
      "uk.ac.sanger.artemis.io.Entry",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.components.alignment.BamView$41",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.components.alignment.BamView",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "uk.ac.sanger.artemis.components.alignment.BamView$47",
      "htsjdk.samtools.ValidationStringency",
      "uk.ac.sanger.artemis.io.IndexFastaStream",
      "uk.ac.sanger.artemis.FeatureVector",
      "htsjdk.samtools.util.RuntimeIOException",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "htsjdk.samtools.util.Locatable",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "htsjdk.samtools.SAMSequenceDictionary",
      "uk.ac.sanger.artemis.components.alignment.SAMRecordFilter",
      "org.apache.log4j.spi.AppenderAttachable",
      "htsjdk.samtools.SamReader",
      "uk.ac.sanger.artemis.components.EntryEdit",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.components.IndexReferenceListener",
      "org.biojava.bio.BioException",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "htsjdk.samtools.SAMSequenceRecord",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("uk.ac.sanger.artemis.Entry", false, CRAMReferenceSequenceFile_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("uk.ac.sanger.artemis.components.alignment.BamView", false, CRAMReferenceSequenceFile_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("uk.ac.sanger.artemis.io.Entry", false, CRAMReferenceSequenceFile_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("uk.ac.sanger.artemis.io.Sequence", false, CRAMReferenceSequenceFile_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("uk.ac.sanger.artemis.sequence.Bases", false, CRAMReferenceSequenceFile_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CRAMReferenceSequenceFile_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.Entry",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.components.alignment.BamView",
      "htsjdk.samtools.reference.ReferenceSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.util.OutOfRangeException"
    );
  }
}
