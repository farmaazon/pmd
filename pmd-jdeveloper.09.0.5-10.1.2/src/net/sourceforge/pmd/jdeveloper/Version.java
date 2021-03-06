package net.sourceforge.pmd.jdeveloper;

import net.sourceforge.pmd.PMD;
import net.sourceforge.pmd.SourceType;

import oracle.ide.addin.Context;

import oracle.jdeveloper.model.JProject;

class Version {

    public static void setJavaVersion(final Context context, final PMD pmd) {
        final JProject project = (JProject) context.getProject();
        final String source = project.getActiveConfiguration().getJdkVersionNumber().toString();
        if (source.startsWith("1.6")) {
            pmd.setJavaVersion(SourceType.JAVA_16);
        } else if (source.startsWith("1.5")) {
            pmd.setJavaVersion(SourceType.JAVA_15);
        } else if (source.startsWith("1.4")) {
            pmd.setJavaVersion(SourceType.JAVA_14);
        } else if (source.startsWith("1.3")) {
            pmd.setJavaVersion(SourceType.JAVA_13);
        }
    }

    public static String version() {
        return "4.2.4.1.0";
    }

}