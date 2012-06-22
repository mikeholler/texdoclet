package org.stfm.texdoclet;

public class HelpOutput {

	protected static void printHelp() {
		System.err.println("TeXDoclet Usage:");
		System.err
				.println("-title <title>            A title to use for the generated output document.");
		// (S.M. modification)
		System.err
				.println("-subtitle <title>         A subtitle for the output document.");
		System.err
				.println("                          No -title will result in no title page.");
		System.err
				.println("-output <outfile>         Specifies the output file to write to.  If none");
		System.err
				.println("                          specified, the default is docs.tex in the current");
		System.err.println("                          directory.");
		System.err
				.println("-docclass <class>         LaTeX2e document class, `report' is the default.");
		System.err
				.println("-doctype <type>           LaTeX2e document style, `headings' is the default.");
		System.err
				.println("-classfilter <name>       The name of a class implementing the ClassFilter interface.");
		System.err
				.println("-date <date string>       The value to use for the document date.");
		System.err
				.println("-author <author>          Specifies string to use for document Author.");
		System.err
				.println("-texinit <file>           LaTeX2e statements included before \\begin{document}.");
		System.err
				.println("-texsetup <file>          LaTeX2e statements included after \\begin{document} \\maketitle (if title was specified).");
		System.err
				.println("-texintro <file>          LaTeX2e statements included after table of contents");
		System.err
				.println("-texfinish <file>         LaTeX2e statements included before \\end{document}.");
		System.err
				.println("-texpackage <file>        LaTeX2e statements included before packages' \\chapter.");
		System.err
				.println("-setup <file>             A setup file included before \\begin{document}.");
		System.err.println("-twosided                 Print twosided.");
		System.err
				.println("-serial                   Do print Serializable information.");
		System.err
				.println("-nosummaries              Do print summaries of fiels, constructors and methods.");
		// (S.M. modification)
		System.err
				.println("-nofieldsummary           Do not print field summaries");
		// (S.M. modification)
		System.err
				.println("-noconstructorsummary     Do not print constructor summaries");
		System.err
				.println("-noinherited              Do not include inherited API information in output.");
		// (S.M. modification)
		System.err
				.println("-shortinherited           Prints a short inheritance, only the member name (not the whole signature)");
		System.err.println("-noindex                  Do not create index.");
		// (S.M. modification) System.err.println(
		// "-notree                   Do not create a class tree." );
		// no class tree is default
		System.err.println("-tree                     Create a class tree.");
		System.err
				.println("-treeindent <float>       Indent <float>cm i the class tree. Default is 1cm.");
		System.err
				.println("-hyperref                 Use the hyperref package.");
		System.err
				.println("-pdfhyperref              Use the hyperref package with pdf. Overrides -hypertex.");
		System.err.println("-version                  Includes version-tags.");
		// ----- (S.M. modification)

		System.err
				.println("-hr                       Prints horizontal rows in the output (to get a better? view).");
		System.err
				.println("-include                  Creates output without latex initiation (writes it in initdocsinclude.tex), titlepage, contents.");
		System.err
				.println("-sectionlevel <level>     Specifies the highest level of sections (either \"subsection\", \"section\" or \"chapter\").");
		System.err
				.println("-imagespath               Path to the texdoclet_images dir (absolute or relative to the output document .tex file).");

		// ----- (S.M. modification end)

	}

}
