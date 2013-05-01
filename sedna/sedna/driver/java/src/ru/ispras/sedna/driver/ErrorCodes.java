
// This file was generated. Do not edit it!!!

package ru.ispras.sedna.driver;
import java.io.*;
import java.lang.*;

class ErrorCodes {
    final static int SE1000 = 0;  // Environment error. This error is caused by the environment (operating system).
    final static int XPST0001 = 1;  // It is a static error if analysis of an expression relies on some component of the static context that has not been assigned a value.
    final static int XPDY0002 = 2;  // It is a dynamic error if evaluation of an expression relies on some part of the dynamic context that has not been assigned a value.
    final static int XPST0003 = 3;  // It is a static error if an expression is not a valid instance of the grammar defined in A.1 EBNF.
    final static int XPTY0004 = 4;  // It is a type error if, during the static analysis phase, an expression is found to have a static type that is not appropriate for the context in which the expression occurs, or during the dynamic evaluation phase, the dynamic type of a value does not match a required type as specified by the matching rules in 2.5.4 SequenceType Matching.
    final static int XPST0005 = 5;  // During the analysis phase, it is a static error if the static type assigned to an expression other than the expression () or data(()) is empty-sequence().
    final static int XPTY0006 = 6;  // (Not currently used.)
    final static int XPTY0007 = 7;  // (Not currently used.)
    final static int XPST0008 = 8;  // It is a static error if an expression refers to an element name, attribute name, schema type name, namespace prefix, or variable name that is not defined in the static context, except within an ElementTest or an AttributeTest.
    final static int XQST0009 = 9;  // An implementation that does not support the Schema Import Feature must raise a static error if a Prolog contains a schema import.
    final static int XPST0010 = 10;  // An implementation must raise a static error if it encounters a reference to an axis that it does not support.
    final static int XQST0012 = 11;  // It is a static error if the set of definitions contained in all schemas imported by a Prolog do not satisfy the conditions for schema validity specified in Sections 3 and 5 of [XML Schema] Part 1--i.e., each definition must be valid, complete, and unique.
    final static int XQST0013 = 12;  // It is a static error if an implementation recognizes a pragma but determines that its content is invalid.
    final static int XQST0014 = 13;  // (Not currently used.)
    final static int XQST0015 = 14;  // (Not currently used.)
    final static int XQST0016 = 15;  // An implementation that does not support the Module Feature raises a static error if it encounters a module declaration or a module import.
    final static int XPST0017 = 16;  // It is a static error if the expanded QName and number of arguments in a function call do not match the name and arity of a function signature in the static context.
    final static int XPTY0018 = 17;  // It is a type error if the result of the last step in a path expression contains both nodes and atomic values.
    final static int XPTY0019 = 18;  // It is a type error if the result of a step (other than the last step) in a path expression contains an atomic value.
    final static int XPTY0020 = 19;  // It is a type error if, in an axis step, the context item is not a node.
    final static int XPDY0021 = 20;  // (Not currently used.)
    final static int XQST0022 = 21;  // It is a static error if the value of a namespace declaration attribute is not a URILiteral.
    final static int XQTY0023 = 22;  // (Not currently used.)
    final static int XQTY0024 = 23;  // It is a type error if the content sequence in an element constructor contains an attribute node following a node that is not an attribute node.
    final static int XQDY0025 = 24;  // It is a dynamic error if any attribute of a constructed element does not have a name that is distinct from the names of all other attributes of the constructed element.
    final static int XQDY0026 = 25;  // It is a dynamic error if the result of the content expression of a computed processing instruction constructor contains the string "?>".
    final static int XQDY0027 = 26;  // In a validate expression, it is a dynamic error if the root element information item in the PSVI resulting from validation does not have the expected validity property: valid if validation mode is strict, or either valid or notKnown if validation mode is lax.
    final static int XQTY0028 = 27;  // (Not currently used.)
    final static int XQDY0029 = 28;  // (Not currently used.)
    final static int XQTY0030 = 29;  // It is a type error if the argument of a validate expression does not evaluate to exactly one document or element node.
    final static int XQST0031 = 30;  // It is a static error if the version number specified in a version declaration is not supported by the implementation.
    final static int XQST0032 = 31;  // A static error is raised if a Prolog contains more than one base URI declaration.
    final static int XQST0033 = 32;  // It is a static error if a Prolog contains multiple declarations for the same namespace prefix.
    final static int XQST0034 = 33;  // It is a static error if multiple functions declared or imported by a module have the number of arguments and their expanded QNames are equal (as defined by the eq operator).
    final static int XQST0035 = 34;  // It is a static error to import two schema components that both define the same name in the same symbol space and in the same scope.
    final static int XQST0036 = 35;  // It is a static error to import a module if the importing module's in-scope schema types do not include definitions for the schema type names that appear in the declarations of variables and functions (whether in an argument type or return type) that are present in the imported module and are referenced in the importing module.
    final static int XQST0037 = 36;  // (Not currently used.)
    final static int XQST0038 = 37;  // It is a static error if a Prolog contains more than one default collation declaration, or the value specified by a default collation declaration is not present in statically known collations.
    final static int XQST0039 = 38;  // It is a static error for a function declaration to have more than one parameter with the same name.
    final static int XQST0040 = 39;  // It is a static error if the attributes specified by a direct element constructor do not have distinct expanded QNames.
    final static int XQDY0041 = 40;  // It is a dynamic error if the value of the name expression in a computed processing instruction constructor cannot be cast to the type xs:NCName.
    final static int XQST0042 = 41;  // (Not currently used.)
    final static int XQST0043 = 42;  // (Not currently used.)
    final static int XQDY0044 = 43;  // It is a dynamic error the node-name of a node constructed by a computed attribute constructor has any of the following properties: its namespace prefix is xmlns, it has no namespace prefix and its local name is xmlns, its namespace URI is http://www.w3.org/2000/xmlns/, its namespace prefix is xml and its namespace URI is not http://www.w3.org/XML/1998/namespace, its namespace prefix is other than xml and its namespace URI is http://www.w3.org/XML/1998/namespace.
    final static int XQST0045 = 44;  // It is a static error if the function name in a function declaration is in one of the following namespaces: http://www.w3.org/XML/1998/namespace, http://www.w3.org/2001/XMLSchema, http://www.w3.org/2001/XMLSchema-instance, http://www.w3.org/2005/xpath-functions, http://www.w3.org/2005/xpath-datatypes.
    final static int XQST0046 = 45;  // An implementation MAY raise a static error if the value of a URILiteral is of nonzero length and is not in the lexical space of xs:anyURI, or if it is a string that represents a "relative reference" as defined in [RFC3986].
    final static int XQST0047 = 46;  // It is a static error if multiple module imports in the same Prolog specify the same target namespace.
    final static int XQST0048 = 47;  // It is a static error if a function or variable declared in a library module is not in the target namespace of the library module.
    final static int XQST0049 = 48;  // It is a static error if two or more variables declared or imported by a module have equal expanded QNames (as defined by the eq operator.)
    final static int XPDY0050 = 49;  // It is a dynamic error if the dynamic type of the operand of a treat expression does not match the sequence type specified by the treat expression. This error might also be raised by a path expression beginning with "/" or "//" if the context node is not in a tree that is rooted at a document node. This is because a leading "/" or "//" in a path expression is an abbreviation for an initial step that includes the clause treat as document-node().
    final static int XPST0051 = 50;  // It is a static error if a QName that is used as an AtomicType in a SequenceType is not defined in the in-scope schema types as an atomic type.
    final static int XQDY0052 = 51;  // (Not currently used.)
    final static int XQST0053 = 52;  // (Not currently used.)
    final static int XQST0054 = 53;  // It is a static error if the initializing expression in a variable declaration cannot be executed because of a circularity (for example, the expression depends on a function that in turn depends on the value of the initialized variable).
    final static int XQST0055 = 54;  // It is a static error if a Prolog contains more than one copy-namespaces declaration.
    final static int XQST0056 = 55;  // (Not currently used.)
    final static int XQST0057 = 56;  // It is a static error if a schema import binds a namespace prefix but does not specify a target namespace other than a zero-length string.
    final static int XQST0058 = 57;  // It is a static error if multiple schema imports specify the same target namespace.
    final static int XQST0059 = 58;  // It is a static error if an implementation is unable to process a schema or module import by finding a schema or module with the specified target namespace.
    final static int XQST0060 = 59;  // It is a static error if the name of a function in a function declaration is not in a namespace (expanded QName has a null namespace URI).
    final static int XQDY0061 = 60;  // It is a dynamic error if the operand of a validate expression is a document node whose children do not consist of exactly one element node and zero or more comment and processing instruction nodes, in any order.
    final static int XQDY0062 = 61;  // (Not currently used.)
    final static int XQST0063 = 62;  // (Not currently used.)
    final static int XQDY0064 = 63;  // It is a dynamic error if the value of the name expression in a computed processing instruction constructor is equal to "XML" (in any combination of upper and lower case).
    final static int XQST0065 = 64;  // A static error is raised if a Prolog contains more than one ordering mode declaration.
    final static int XQST0066 = 65;  // A static error is raised if a Prolog contains more than one default element/type namespace declaration, or more than one default function namespace declaration.
    final static int XQST0067 = 66;  // A static error is raised if a Prolog contains more than one construction declaration.
    final static int XQST0068 = 67;  // A static error is raised if a Prolog contains more than one boundary-space declaration.
    final static int XQST0069 = 68;  // A static error is raised if a Prolog contains more than one empty order declaration.
    final static int XQST0070 = 69;  // A static error is raised if one of the predefined prefixes xml or xmlns appears in a namespace declaration, or if any of the following conditions is statically detected in any expression or declaration: the prefix xml is bound to some namespace URI other than http://www.w3.org/XML/1998/namespace, a prefix other than xml is bound to the namespace URI http://www.w3.org/XML/1998/namespace, the prefix xmlns is bound to any namespace URI, a prefix other than xmlns is bound to the namespace URI http://www.w3.org/2000/xmlns/.
    final static int XQST0071 = 70;  // A static error is raised if the namespace declaration attributes of a direct element constructor do not have distinct names.
    final static int XQDY0072 = 71;  // It is a dynamic error if the result of the content expression of a computed comment constructor contains two adjacent hyphens or ends with a hyphen.
    final static int XQST0073 = 72;  // It is a static error if the graph of module imports contains a cycle (that is, if there exists a sequence of modules M1 ... Mn such that each Mi imports Mi+1 and Mn imports M1), unless all the modules in the cycle share a common namespace.
    final static int XQDY0074 = 73;  // It is a dynamic error if the value of the name expression in a computed element or attribute constructor cannot be converted to an expanded QName (for example, because it contains a namespace prefix not found in statically known namespaces.)
    final static int XQST0075 = 74;  // An implementation that does not support the Validation Feature must raise a static error if it encounters a validate expression.
    final static int XQST0076 = 75;  // It is a static error if a collation subclause in an order by clause of a FLWOR expression does not identify a collation that is present in statically known collations.
    final static int XQST0077 = 76;  // (Not currently used.)
    final static int XQST0078 = 77;  // (Not currently used.)
    final static int XQST0079 = 78;  // It is a static error if an extension expression contains neither a pragma that is recognized by the implementation nor an expression enclosed in curly braces.
    final static int XPST0080 = 79;  // The target type of a cast or castable expression must be an atomic type that is in the in-scope schema types and is not xs:NOTATION or xs:anyAtomicType, optionally followed by the occurrence indicator "?"; otherwise a static error is raised.
    final static int XPST0081 = 80;  // It is a static error if a QName used in a query contains a namespace prefix that cannot be expanded into a namespace URI by using the statically known namespaces.
    final static int XQST0082 = 81;  // (Not currently used.)
    final static int XPST0083 = 82;  // (Not currently used.)
    final static int XQDY0084 = 83;  // It is a dynamic error if the element validated by a validate statement does not have a top-level element declaration in the in-scope element declarations, if validation mode is strict.
    final static int XQST0085 = 84;  // It is a static error if the namespace URI in a namespace declaration attribute is a zero-length string, and the implementation does not support [XML Names 1.1].
    final static int XQTY0086 = 85;  // It is a type error if the typed value of a copied element or attribute node is namespace-sensitive when construction mode is preserve and copy-namespaces mode is no-preserve.
    final static int XQST0087 = 86;  // It is a static error if the encoding specified in a Version Declaration does not conform to the definition of EncName specified in [XML 1.0].
    final static int XQST0088 = 87;  // It is a static error if the literal that specifies the target namespace in a module import or a module declaration is of zero length.
    final static int XQST0089 = 88;  // It is a static error if a variable bound in a for clause of a FLWOR expression, and its associated positional variable, do not have distinct names (expanded QNames).
    final static int XQST0090 = 89;  // It is a static error if a character reference does not identify a valid character in the version of XML that is in use.
    final static int XQST0093 = 90;  // It is a static error to import a module M1 if there exists a sequence of modules M1 ... Mi ... M1 such that each module directly depends on the next module in the sequence.
    final static int FOER0000 = 91;  // Unidentified error.
    final static int FOAR0001 = 92;  // Division by zero. This error is raised whenever an attempt is made to divide by zero.
    final static int FOAR0002 = 93;  // Numeric operation overflow/underflow. This error is raised whenever numeric operations result in an overflow or underflow.
    final static int FOCA0001 = 94;  // Input value too large for decimal. 
    final static int FOCA0002 = 95;  // Invalid lexical value. 
    final static int FOCA0003 = 96;  // Input value too large for integer. 
    final static int FOCA0005 = 97;  // NaN supplied as float/double value. 
    final static int FOCA0006 = 98;  // String to be cast to decimal has too many digits of precision. 
    final static int FOCH0001 = 99;  // Code point not valid. 
    final static int FOCH0002 = 100;  // Unsupported collation. 
    final static int FOCH0003 = 101;  // Unsupported normalization form. 
    final static int FOCH0004 = 102;  // Collation does not support collation units. 
    final static int FODC0001 = 103;  // No context document. 
    final static int FODC0002 = 104;  // Error retrieving resource. 
    final static int FODC0003 = 105;  // Function stability not defined. 
    final static int FODC0004 = 106;  // Invalid argument to fn:collection. 
    final static int FODC0005 = 107;  // Invalid argument to fn:doc. 
    final static int FODT0001 = 108;  // Overflow/underflow in date/time operation. 
    final static int FODT0002 = 109;  // Overflow/underflow in duration operation. 
    final static int FODT0003 = 110;  // Invalid timezone value. 
    final static int FONS0004 = 111;  // No namespace found for prefix. 
    final static int FONS0005 = 112;  // Base-uri not defined in the static context. 
    final static int FORG0001 = 113;  // Invalid value for cast/constructor. 
    final static int FORG0002 = 114;  // Invalid argument to URL resolve algorithm. 
    final static int FORG0003 = 115;  // fn:zero-or-one called with a sequence containing more than one item. 
    final static int FORG0004 = 116;  // fn:one-or-more called with a sequence containing no items. 
    final static int FORG0005 = 117;  // fn:exactly-one called with a sequence containing zero or more than one item. 
    final static int FORG0006 = 118;  // Invalid argument type. 
    final static int FORG0008 = 119;  // Both arguments to fn:dateTime have a specified timezone. 
    final static int FORG0009 = 120;  // Error in resolving a relative URI against a base URI in fn:resolve-uri. 
    final static int FORX0001 = 121;  // Invalid regular expression flags. 
    final static int FORX0002 = 122;  // Invalid regular expression. 
    final static int FORX0003 = 123;  // Regular expression matches zero-length string. 
    final static int FORX0004 = 124;  // Invalid replacement string. 
    final static int FOTY0012 = 125;  // Argument node does not have a typed value. 
    final static int SE1001 = 126;  // Physical plan executor stack overflow.
    final static int SE1002 = 127;  // Feature is not implemented.
    final static int SE1003 = 128;  // Sedna internal error.
    final static int SE1004 = 129;  // Wrong physical plan representation.
    final static int SE1005 = 130;  // Scheme parser error.
    final static int SE1006 = 131;  // No document with this name in the specified collection.
    final static int SE1007 = 132;  // Invalid position in fn:item-at.
    final static int SE1008 = 133;  // Sedna index subsystem error.
    final static int SE1009 = 134;  // Buffer overflow.
    final static int SE1011 = 135;  // Data file has reached its maximum size.
    final static int SE1012 = 136;  // Temporary file has reached its maximum size.
    final static int SE1013 = 137;  // Cannot extend data file.
    final static int SE1014 = 138;  // Cannot extend temporary file.
    final static int SE1015 = 139;  // There is not enough memory to initialize buffers.
    final static int SE1016 = 140;  // Cannot lock buffer memory.
    final static int SE1017 = 141;  // Cannot mount ramfs.
    final static int SE1018 = 142;  // Transaction with this id already exists.
    final static int SE1019 = 143;  // There is no transaction with this id.
    final static int SE1020 = 144;  // The limit on the transaction on locked blocks in memory has been exceeded.
    final static int SE1021 = 145;  // Cannot lock the block in memory, because it is not in memory.
    final static int SE1022 = 146;  // Cannot unlock block, because it is not in memory.
    final static int SE1023 = 147;  // Unexpected arguments in call to Storage Manager.
    final static int SE1031 = 148;  // Cannot allocate enough address space segment.
    final static int SE1032 = 149;  // Error setting up alternate stack.
    final static int SE1033 = 150;  // Error setting up signal handler.
    final static int SE1034 = 151;  // Connection with Storage Manager lost.
    final static int SE1035 = 152;  // Memory mapping error.
    final static int SE1036 = 153;  // Cannot (un)swap blocks, because the address is out of bounds.
    final static int SE1037 = 154;  // Cannot open buffer memory.
    final static int SE1038 = 155;  // Cannot close buffer memory.
    final static int SE1039 = 156;  // Error waiting for the Virtual Memory Manager thread to shutdown.
    final static int SE1040 = 157;  // Cannot determine enough address space segment.
    final static int SE1051 = 158;  // Sedna query optimizer error.
    final static int SE1061 = 159;  // No index with this name.
    final static int SE1071 = 160;  // Expecting arguments of type xs:string.
    final static int SE1072 = 161;  // Modules to be loaded belong to different namespaces.
    final static int SE1073 = 162;  // Module with the given URI already loaded to the database.
    final static int SE1074 = 163;  // Unable to drop a module - no module with the given URI.
    final static int SE2001 = 164;  // Document with the same name already exists.
    final static int SE2002 = 165;  // Collection with the same name already exists.
    final static int SE2003 = 166;  // No collection with this name.
    final static int SE2004 = 167;  // Document with the same name already exists in the collection.
    final static int SE2005 = 168;  // Parse error at 
    final static int SE2006 = 169;  // No document with this name.
    final static int SE2007 = 170;  // Left sibling is not an attribute.
    final static int SE2008 = 171;  // Valid URI expected.
    final static int SE2009 = 172;  // Size of text should be greater than zero.
    final static int SE2010 = 173;  // Invalid result of the delete undeep argument: sequence contains non-persistent or document nodes.
    final static int SE2011 = 174;  // Invalid result of the delete argument: sequence contains atomic values.
    final static int SE2012 = 175;  // Invalid result of the delete argument: sequence contains temporary nodes.
    final static int SE2013 = 176;  // Invalid result of the second insert argument: sequence contains atomic values or temporary nodes.
    final static int SE2014 = 177;  // Invalid result of the first insert argument: bad sequence of nodes.
    final static int SE2015 = 178;  // Invalid result of the first insert argument: sequence contains atomic values.
    final static int SE2016 = 179;  // Attempt to insert element before attribute.
    final static int SE2017 = 180;  // Attempt to insert the node to its descendant.
    final static int SE2018 = 181;  // Invalid result of the second insert argument: sequence contains either attribute, namespace, comment, PI or temporary node.
    final static int SE2019 = 182;  // Invalid result of the second insert argument: sequence contains atomic values.
    final static int SE2020 = 183;  // Invalid result of the update argument: sequence contains atomic values or one of these nodes: temporary, text, comment, PI, namespace, document.
    final static int SE2021 = 184;  // Invalid result of the update argument: sequence contains atomic values.
    final static int SE2022 = 185;  // This node test is not yet implemented.
    final static int SE2023 = 186;  // [nid_assign] The length of prefix exceeds PSTRMAXSIZE.
    final static int SE2024 = 187;  // Trying to store a string that exceeds the maximum permitted size.
    final static int SE2025 = 188;  // checkTreeConsistency:Ancestor-descendant error.
    final static int SE2026 = 189;  // checkTreeConsistency:First child pointer.
    final static int SE2027 = 190;  // checkTreeConsistency:sibling pointer errors.
    final static int SE2028 = 191;  // checkTreeConsistency:nid comparison error.
    final static int SE2029 = 192;  // checkTreeConsistency:wrong descriptor's order.
    final static int SE2030 = 193;  // checkTreeConsistency:Bad indirection table.
    final static int SE2031 = 194;  // Atomic value as input for test engine.
    final static int SE2032 = 195;  // Trying to create mixed content in the element whose value is used as key.
    final static int SE2033 = 196;  // An index with the same name already exists.
    final static int SE2034 = 197;  // Invalid index type, only xs:string, xs:integer, xs:float, xs:double, xs:date, xs:time, xs:dateTime, xs_yearMonthDuration, xs_dateTimeDuration are supported in B-tree based index.
    final static int SE2035 = 198;  // Invalid mode in index_scan_between function.
    final static int SE2036 = 199;  // Document node deletion is prohibited by this function, use DROP DOCUMENT in metadata API.
    final static int SE2037 = 200;  // The size of string is limited (4GB approximately).
    final static int SE2038 = 201;  // An attempt to insert attribute node after element.
    final static int SE2100 = 202;  // SQL:Bad connect option.
    final static int SE2101 = 203;  // SQL:Bad handle.
    final static int SE2102 = 204;  // SQL:Failed to get executor.
    final static int SE2103 = 205;  // SQL:Unknown handle type.
    final static int SE2104 = 206;  // SQL:Invalid handle type.
    final static int SE2105 = 207;  // SQL:Failed to prepare statement.
    final static int SE2106 = 208;  // SQL:Failed to execute prepared statement.
    final static int SE2107 = 209;  // SQL:Not enough parameters for prepared statement.
    final static int SE2108 = 210;  // SQL:Disconnect failed.
    final static int SE2109 = 211;  // SQL:Commit failed.
    final static int SE2110 = 212;  // SQL:Rollback failed.
    final static int SE2111 = 213;  // SQL:Connect failed.
    final static int SE2112 = 214;  // SQL:Execute failed.
    final static int SE2113 = 215;  // SQL Connection support disabled.
    final static int SE2200 = 216;  // External function initialization error.
    final static int SE2201 = 217;  // External function invocation error.
    final static int SE2202 = 218;  // External function de-initialization error.
    final static int SE2203 = 219;  // External function load error.
    final static int SE2999 = 220;  // Sedna Client-Server Protocol used in your application does not support this feature. Use the protocol of the most recent version.
    final static int SE3000 = 221;  // Failed to clean up socket library.
    final static int SE3001 = 222;  // Failed to initialize a socket.
    final static int SE3002 = 223;  // Failed to get local host name.
    final static int SE3003 = 224;  // Failed to connect to the specified host.
    final static int SE3004 = 225;  // Failed to bind the socket to the specified port.
    final static int SE3005 = 226;  // Failed to set the socket into the listening mode.
    final static int SE3006 = 227;  // Failed to send a message.
    final static int SE3007 = 228;  // Failed to receive a message.
    final static int SE3008 = 229;  // Unknown message from server.
    final static int SE3009 = 230;  // Unknown message from client.
    final static int SE3010 = 231;  // Cannot duplicate socket handle.
    final static int SE3011 = 232;  // Failed to close a socket.
    final static int SE3012 = 233;  // Message length exceeds available size.
    final static int SE3013 = 234;  // Cannot get file from the client to be loaded.
    final static int SE3014 = 235;  // Wrong client-server protocol version.
    final static int SE3015 = 236;  // Too long login/password/databasename.
    final static int SE3016 = 237;  // Failed to initialize socket library.
    final static int SE3017 = 238;  // Cannot open file with data to load.
    final static int SE3018 = 239;  // Cannot read file with data to load.
    final static int SE3019 = 240;  // Cannot close file with data to load.
    final static int SE3020 = 241;  // Cannot close tmp file.
    final static int SE3021 = 242;  // Cannot delete tmp file.
    final static int SE3022 = 243;  // Invalid argument.
    final static int SE3023 = 244;  // Database name is too long.
    final static int SE3024 = 245;  // Login name (user name) is too long.
    final static int SE3025 = 246;  // Password is too long.
    final static int SE3026 = 247;  // URL is too long.
    final static int SE3027 = 248;  // Failed to set socket option.
    final static int SE3028 = 249;  // Connection with server is closed or has not been established yet.
    final static int SE3029 = 250;  // This function call is prohibited as the connection is in the autocommit mode.
    final static int SE3030 = 251;  // Failed to initialize SSMMsg service (message service).
    final static int SE3031 = 252;  // Failed to serve clients via SSMMsg service (message service).
    final static int SE3032 = 253;  // Failed to stop serve clients via SSMMsg service (message service).
    final static int SE3033 = 254;  // Failed to shutdown SSMMsg service (message service).
    final static int SE3034 = 255;  // Cannot send message via SSMMsg
    final static int SE3040 = 256;  // Connection with GOVERNOR lost.
    final static int SE3043 = 257;  // Can not register session in GOVERNOR.
    final static int SE3044 = 258;  // Can not unregister session in GOVERNOR.
    final static int SE3045 = 259;  // Can not register Storage Manager in GOVERNOR.
    final static int SE3046 = 260;  // Cannot create new session, because the number of sessions exceeds the permissible amount.
    final static int SE3047 = 261;  // Cannot open session, because the client failed to send the authentication parameters on time.
    final static int SE3051 = 262;  // Failed to set up ctrl handler.
    final static int SE3052 = 263;  // Failed to run se_trn process.
    final static int SE3053 = 264;  // Authentication failed.
    final static int SE3054 = 265;  // Cannot run session: system is busy.
    final static int SE3060 = 266;  // Failed to create a new ACL.
    final static int SE3061 = 267;  // Failed to set DACL to the data file security descriptor.
    final static int SE3062 = 268;  // Failed to open process token.
    final static int SE3063 = 269;  // Failed to release ACL.
    final static int SE3064 = 270;  // You do not have enough permissions: you have to be root in UNIX or a member of the Administrators group in Windows to be able to run the application.
    final static int SE3065 = 271;  // You do not have the necessary privileges on this database object.
    final static int SE3066 = 272;  // Failed to process authorization.
    final static int SE3067 = 273;  // User name is not specified.
    final static int SE3068 = 274;  // This statement is not supported, because the database security level of Sedna is "off". To support this statement create a database with -db-security option "authentication".
    final static int SE3069 = 275;  // Wrong privilege name.
    final static int SE3070 = 276;  // Multiple parameters parted by commas are not supported in the current version of Sedna.
    final static int SE3071 = 277;  // Failed to load authorization metadata.
    final static int SE3072 = 278;  // User does not have privilege.
    final static int SE3073 = 279;  // User is not allowed to grant this privilege.
    final static int SE3074 = 280;  // User is not allowed to grant this role.
    final static int SE3075 = 281;  // User is not allowed to revoke this privilege, or the grantee does not have this privilege.
    final static int SE3076 = 282;  // User is not allowed to revoke this role, or the grantee does not have this role.
    final static int SE3077 = 283;  // User is not allowed to alter the specified user.
    final static int SE3078 = 284;  // User is not allowed to drop the specified user.
    final static int SE3079 = 285;  // User with this name already exists.
    final static int SE3080 = 286;  // Role with this name already exists.
    final static int SE3200 = 287;  // Trigger with this name already exists.
    final static int SE3201 = 288;  // Failed to execute trigger action.
    final static int SE3202 = 289;  // Wrong trigger action parameter type.
    final static int SE3203 = 290;  // Trigger action results in an item that is not a node.
    final static int SE3204 = 291;  // Trigger action must always return a result.
    final static int SE3205 = 292;  // Trigger action tries to update a document/collection that is currently being updated by the outer update statement.
    final static int SE3206 = 293;  // Cannot execute trigger action, since the current cascade level exceeds the permissible level.
    final static int SE4001 = 294;  // XQuery parser internal error.
    final static int SE4002 = 295;  // Unexpected type of the query given.
    final static int SE4003 = 296;  // Unexpected number of statements given.
    final static int SE4004 = 297;  // Scheme part unknown error.
    final static int SE4005 = 298;  // Invalid list after scheme processing.
    final static int SE4006 = 299;  // Static query analysis error.
    final static int SE4007 = 300;  // Too long statement.
    final static int SE4008 = 301;  // Wrong logical plan representation.
    final static int SE4009 = 302;  // Too long input query.
    final static int SE4010 = 303;  // Cannot create semaphore.
    final static int SE4011 = 304;  // Cannot release semaphore.
    final static int SE4012 = 305;  // Cannot open semaphore.
    final static int SE4013 = 306;  // Cannot close semaphore.
    final static int SE4014 = 307;  // Cannot up semaphore.
    final static int SE4015 = 308;  // Cannot down semaphore.
    final static int SE4016 = 309;  // Cannot create shared memory.
    final static int SE4020 = 310;  // Cannot release shared memory.
    final static int SE4021 = 311;  // Cannot open shared memory.
    final static int SE4022 = 312;  // Cannot close shared memory.
    final static int SE4023 = 313;  // Cannot attach to shared memory.
    final static int SE4024 = 314;  // Cannot deattach from shared memory.
    final static int SE4025 = 315;  // Cannot create pipe.
    final static int SE4030 = 316;  // Cannot close pipe.
    final static int SE4031 = 317;  // Cannot read pipe.
    final static int SE4032 = 318;  // Cannot write pipe.
    final static int SE4040 = 319;  // Cannot create file.
    final static int SE4041 = 320;  // Cannot delete file.
    final static int SE4042 = 321;  // Cannot open file.
    final static int SE4043 = 322;  // Cannot close file.
    final static int SE4044 = 323;  // Cannot read file.
    final static int SE4045 = 324;  // Cannot write file.
    final static int SE4046 = 325;  // Cannot set file pointer.
    final static int SE4047 = 326;  // Cannot set end of file.
    final static int SE4048 = 327;  // Cannot create directory.
    final static int SE4049 = 328;  // Cannot copy file.
    final static int SE4050 = 329;  // Cannot get file size.
    final static int SE4051 = 330;  // Cannot get disk sector size.
    final static int SE4052 = 331;  // Cannot get unique file name.
    final static int SE4053 = 332;  // Cannot open directory.
    final static int SE4054 = 333;  // Cannot close directory.
    final static int SE4055 = 334;  // Cannot create directory.
    final static int SE4060 = 335;  // Cannot create thread.
    final static int SE4061 = 336;  // Cannot suspend thread.
    final static int SE4062 = 337;  // Cannot resume thread.
    final static int SE4063 = 338;  // Cannot close thread.
    final static int SE4064 = 339;  // Cannot exit thread.
    final static int SE4065 = 340;  // Cannot sleep thread.
    final static int SE4070 = 341;  // Cannot create process.
    final static int SE4071 = 342;  // Cannot terminate process.
    final static int SE4072 = 343;  // Cannot set environment variable.
    final static int SE4073 = 344;  // Cannot get environment variable.
    final static int SE4074 = 345;  // Cannot create memory mapping.
    final static int SE4075 = 346;  // Cannot release memory mapping.
    final static int SE4076 = 347;  // Cannot open memory mapping.
    final static int SE4077 = 348;  // Cannot close memory mapping.
    final static int SE4078 = 349;  // Cannot perform memory mapping.
    final static int SE4079 = 350;  // Cannot perform memory unmapping.
    final static int SE4080 = 351;  // Cannot set handles property.
    final static int SE4081 = 352;  // Cannot get image path of the process.
    final static int SE4082 = 353;  // Bad query encoding.
    final static int SE4083 = 354;  // Cannot read directory.
    final static int SE4150 = 355;  // Logical log read buffer is too small.
    final static int SE4151 = 356;  // The shared memory size for logical log is too small.
    final static int SE4152 = 357;  // Bad parameters: the start LSN is less than the end LSN.
    final static int SE4153 = 358;  // Bad checkpoint record given.
    final static int SE4154 = 359;  // Bad record from logical log given.
    final static int SE4155 = 360;  // Bad transaction identifier given.
    final static int SE4156 = 361;  // Too large record for logical log
    final static int SE4200 = 362;  // There is no database with the specified name.
    final static int SE4201 = 363;  // Not Well-Formed Config file.
    final static int SE4202 = 364;  // Storage Manager startup failure: Sedna server is not running.
    final static int SE4203 = 365;  // Cannot send message via SSMMsg.
    final static int SE4204 = 366;  // Database with the same name is already running.
    final static int SE4205 = 367;  // Failed to run Storage Manager in the background mode; use "-background-mode off" for detailed diagnostics.
    final static int SE4206 = 368;  // Failed to initialize system parameters.
    final static int SE4207 = 369;  // Failed to set up ctrl handler.
    final static int SE4208 = 370;  // Failed to shutdown Storage Manager: Sedna server is not running.
    final static int SE4209 = 371;  // Failed to shutdown Storage Manager.
    final static int SE4210 = 372;  // Error waiting for checkpoint thread to shutdown.
    final static int SE4211 = 373;  // Failed to create the database.
    final static int SE4212 = 374;  // Database files format is incompatible with SEDNA binaries.
    final static int SE4300 = 375;  // Path is not valid.
    final static int SE4301 = 376;  // Cannot initialize system structures.
    final static int SE4302 = 377;  // Cannot create persistent heap.
    final static int SE4303 = 378;  // Cannot allocate memory from persistent heap.
    final static int SE4304 = 379;  // Cannot close persistent heap.
    final static int SE4305 = 380;  // Cannot release system structures.
    final static int SE4306 = 381;  // Cannot back up PH (persistent heap).
    final static int SE4307 = 382;  // Invalid database name.
    final static int SE4308 = 383;  // Failed to drop a database.
    final static int SE4400 = 384;  // SEDNA server is not running. Did you forget to run se_gov command?
    final static int SE4401 = 385;  // Failed to run GOVERNOR in the background mode; use "-background-mode off" for detailed diagnostics.
    final static int SE4402 = 386;  // Failed to run GOVERNOR.
    final static int SE4403 = 387;  // Failed to set up ctrl handler for GOVERNOR.
    final static int SE4404 = 388;  // Error occured during closing GOVERNOR.
    final static int SE4405 = 389;  // Session cannot be closed.
    final static int SE4406 = 390;  // There is no sign of the SEDNA server running in the system.
    final static int SE4408 = 391;  // Failed to run GOVERNOR: SEDNA server is running.
    final static int SE4409 = 392;  // Failed to open session: database is not started.
    final static int SE4410 = 393;  // Cannot rename last soft fault directory.
    final static int SE4411 = 394;  // Cannot set sedna data variable.
    final static int SE4412 = 395;  // The number of database config files exceeds the maximum allowable number of config files.
    final static int SE4413 = 396;  // Cannot create session process.
    final static int SE4500 = 397;  // Bad logical record given from logical log.
    final static int SE4501 = 398;  // Cannot recover database by logical log.
    final static int SE4510 = 399;  // Hot-backup utility error.
    final static int SE4600 = 400;  // One of the command line arguments is too long.
    final static int SE4601 = 401;  // Command line arguments are not correct.
    final static int SE4602 = 402;  // Cannot get current working directory absolute path.
    final static int SE4603 = 403;  // Cannot get absolute path to the file.
    final static int SE4604 = 404;  // Cannot change working directory.
    final static int SE4605 = 405;  // Initialization of persistent heap failed.
    final static int SE4606 = 406;  // Release of persistent heap failed.
    final static int SE4607 = 407;  // Cannot run transaction: system is busy.
    final static int SE4608 = 408;  // Transaction is rolled back, because server is stopping.
    final static int SE4609 = 409;  // The database does not exist.
    final static int SE4610 = 410;  // There is no transaction to commit.
    final static int SE4611 = 411;  // There is no transaction to roll back.
    final static int SE4612 = 412;  // Commit current transaction before beginning a new one.
    final static int SE4613 = 413;  // Since version 0.6 of sedna the command se_trn is an internal process and cannot be run manually. Use se_term instead.
    final static int SE4614 = 414;  // There is no next item of the user's query.
    final static int SE4615 = 415;  // Begin transaction before executing a query.
    final static int SE4616 = 416;  // Cannot load a document, because the session is loading another document. Finish current loading before beginning a new one.
    final static int SE4617 = 417;  // Failed to set session option (invalid value)
    final static int SE4618 = 418;  // Reserved.
    final static int SE4700 = 419;  // Unknown resource identifier type.
    final static int SE4701 = 420;  // Internal Lock Manager error.
    final static int SE4702 = 421;  // The length of the resource name is too long.
    final static int SE4703 = 422;  // The transaction is a victim of deadlock resolution procedure.
    final static int SE4704 = 423;  // Unknown reply from Lock Manager.
    final static int SE4705 = 424;  // Deadlock is detected.
    final static int SE4706 = 425;  // Cannot perform update operations in read-only mode.
    final static int SE5000 = 426;  // Unexpected number of arguments.
    final static int SE5001 = 427;  // Prolog not found for query.
    final static int SE5002 = 428;  // Body not found for query.
    final static int SE5003 = 429;  // Empty or unexpected query.
    final static int SE5004 = 430;  // Unexpected query.
    final static int SE5005 = 431;  // Unexpected expression.
    final static int SE5006 = 432;  // Operation not yet supported.
    final static int SE5008 = 433;  // Unexpected namespace prefix.
    final static int SE5012 = 434;  // Declaration not supported.
    final static int SE5014 = 435;  // Not a constant.
    final static int SE5015 = 436;  // Not a proper QName (qualified name).
    final static int SE5016 = 437;  // Unknown item type.
    final static int SE5017 = 438;  // Not a name specifier.
    final static int SE5018 = 439;  // Not a type declaration.
    final static int SE5019 = 440;  // Improper list of formal parameters.
    final static int SE5020 = 441;  // Not a valid variable name.
    final static int SE5021 = 442;  // Not a return type declaration.
    final static int SE5022 = 443;  // Not a function body.
    final static int SE5023 = 444;  // Malformed variable name.
    final static int SE5026 = 445;  // Type definition for constant not found.
    final static int SE5027 = 446;  // Constant value is not compatible with the type definition.
    final static int SE5028 = 447;  // Constant is not a proper QName (qualified name).
    final static int SE5030 = 448;  // Not a type specifier.
    final static int SE5032 = 449;  // Not an anonimous function definition.
    final static int SE5033 = 450;  // Too many arguments in a function.
    final static int SE5034 = 451;  // DDO contains atomic values in its argument.
    final static int SE5035 = 452;  // Not an ivar declaration.
    final static int SE5036 = 453;  // No function name provided in the function call.
    final static int SE5040 = 454;  // Empty or unexpected update operation.
    final static int SE5041 = 455;  // Unknown update operation.
    final static int SE5042 = 456;  // Insert is applied to a non-node type.
    final static int SE5043 = 457;  // Rename is applied to a non-node type.
    final static int SE5044 = 458;  // Delete is applied to a non-node type.
    final static int SE5045 = 459;  // Empty or unexpected manage operation.
    final static int SE5046 = 460;  // Unknown manage operation.
    final static int SE5047 = 461;  // Empty or unexpected metadata operation.
    final static int SE5048 = 462;  // Unknown metadata operation.
    final static int SE5049 = 463;  // Not a structural XPath supplied.
    final static int SE5050 = 464;  // Unknown mode supplied for index-scan function call.
    final static int SE5051 = 465;  // Unknown range specified for index-scan-between function call.
    final static int SE5054 = 466;  // Unexpected value of the boundary-space declaration.
    final static int SE5055 = 467;  // Unknown option in XQuery prolog.
    final static int SE5056 = 468;  // Malformed cases supplied in a typeswitch operation.
    final static int SE5057 = 469;  // No default case supplied for a typeswitch operation.
    final static int SE5058 = 470;  // Unexpected case for a typeswitch operation.
    final static int SE5059 = 471;  // Malformed default case for a typeswitch operation.
    final static int SE5060 = 472;  // Unexpected default empty order declaration in XQuery prolog.
    final static int SE5061 = 473;  // Malformed ascending/descending order declaration in ORDER BY clause.
    final static int SE5062 = 474;  // Malformed empty greatest / empty least declaration in ORDER BY clause.
    final static int SE5063 = 475;  // Malformed stable ORDER BY.
    final static int SE5064 = 476;  // Order modifier expected.
    final static int SE5065 = 477;  // Order specification expected.
    final static int SE5066 = 478;  // Order specifications expected.
    final static int SE5067 = 479;  // Malformed name-value pair in Sedna-specific option declaration.
    final static int SE5068 = 480;  // Unknown key(s) given in se:output option.
    final static int SE5069 = 481;  // Empty option value for Sedna-specific option.
    final static int SE5070 = 482;  // Duplicate key entry in se:output option.
    final static int SE5071 = 483;  // Unknown value bound with a "method" key in se:output option.
    final static int SE5072 = 484;  // Unknown value bound with an "indent" key in se:output option.
    final static int SE5073 = 485;  // Unknown time specifier in CREATE TRIGGER statement. Expected: BEFORE or AFTER.
    final static int SE5074 = 486;  // Unknown event specifier in CREATE TRIGGER statement.
    final static int SE5075 = 487;  // Malformed list of statements in the DO-clause of CREATE TRIGGER statement.
    final static int SE5076 = 488;  // Unknown granularity specified in CREATE TRIGGER statement.
    final static int SE5077 = 489;  // Variable declaration expected.
    final static int SE5078 = 490;  // LibraryModule expected, given unexpected.
    final static int SE5079 = 491;  // Unexpected ModuleDecl supplied.
    final static int SE5080 = 492;  // Unknown full-text index type supplied for a CREATE FULL-TEXT INDEX statement.
    final static int SE5081 = 493;  // Ill-formed "customized-value" full-text index type provided.
    final static int SE5100 = 494;  // Error in Scheme part.
    final static int SE5101 = 495;  // Scheme part panic.
    final static int SE5500 = 496;  // An attempt to create a statement on a closed connection.
    final static int SE5501 = 497;  // Result item cannot be returned as a String because it is too large.
    final static int SE5502 = 498;  // Unsupported encoding.
    final static int SE6000 = 499;  // User statement is too large: the maximum size allowed is 2 Mb.
    final static int SE9000 = 500;  // User defined error
    final static int SE2039 = 501;  // Invalid result of the second insert argument: sequence contains non-persistent or document nodes.
    final static int SE3207 = 502;  // XPath expression after the "ON" keyword is invalid.
    final static int SE3208 = 503;  // The trigger variable is used but undefined in this context.
    final static int SE3209 = 504;  // It is prohibited to use trigger variables in statement-level triggers.
    final static int SE4619 = 505;  // Unknown session option.
    final static int SE3210 = 506;  // Trigger action in a node-level trigger must end with an XQuery query.
    final static int SE3211 = 507;  // No trigger with this name.
    final static int SE2040 = 508;  // Too many children by schema.
    final static int SE4620 = 509;  // Transaction has been rolled back as a result of a timeout or hard stop request.
    final static int SE4801 = 510;  // Cannot initialize wu.
    final static int SE4802 = 511;  // Cannot release wu.
    final static int SE2041 = 512;  // Result is cut, because its size exceeds the maximum allowed size set by the client.
    final static int SE4901 = 513;  // Internal LFS error.
    final static int SE4902 = 514;  // Internal LL error.
    final static int SE4903 = 515;  // Hot-backup error.
    final static int SE4621 = 516;  // Property is unknown.
    final static int SE4622 = 517;  // This statement is not supported because the database security level of Sedna is "authentication". To support this statement create database with -db-security option "authorization".
    final static int SE5200 = 518;  // Internal Runtime Configuration utility error.
    final static int SE4623 = 519;  // Cannot set keep alive session timeout.
    final static int SE4624 = 520;  // Session was closed, because the keep alive timeout has been reached.
    final static int SE3081 = 521;  // Cannot open a file with a long query to execute.
    final static int XQDY0096 = 522;  // It is a dynamic error the node-name of a node constructed by a computed element constructor has any of the following properties: its namespace prefix is xmlns, its namespace URI is http://www.w3.org/2000/xmlns/, its namespace prefix is xml and its namespace URI is not http://www.w3.org/XML/1998/namespace, its namespace prefix is other than xml and its namespace URI is http://www.w3.org/XML/1998/namespace.
    final static int SE3082 = 523;  // Prolog is prohibited in CREATE TRIGGER statements
    final static int SE2301 = 524;  // Unsupported serialization method.
    final static int SE2302 = 525;  // Serialization internal error: unknown node type passed.
    final static int SE2901 = 526;  // The feature is no longer supported.
    final static int SE4084 = 527;  // Unsupported index type.
    final static int SE2042 = 528;  // Invalid index type, only xs:string is supported in BST based index.
    final static int SE2043 = 529;  // Too long attribute value.

    static String [][] user_error_code_entry = {
         { "SE1000", "Environment error. This error is caused by the environment (operating system)."}
        ,{ "XPST0001", "It is a static error if analysis of an expression relies on some component of the static context that has not been assigned a value."}
        ,{ "XPDY0002", "It is a dynamic error if evaluation of an expression relies on some part of the dynamic context that has not been assigned a value."}
        ,{ "XPST0003", "It is a static error if an expression is not a valid instance of the grammar defined in A.1 EBNF."}
        ,{ "XPTY0004", "It is a type error if, during the static analysis phase, an expression is found to have a static type that is not appropriate for the context in which the expression occurs, or during the dynamic evaluation phase, the dynamic type of a value does not match a required type as specified by the matching rules in 2.5.4 SequenceType Matching."}
        ,{ "XPST0005", "During the analysis phase, it is a static error if the static type assigned to an expression other than the expression () or data(()) is empty-sequence()."}
        ,{ "XPTY0006", "(Not currently used.)"}
        ,{ "XPTY0007", "(Not currently used.)"}
        ,{ "XPST0008", "It is a static error if an expression refers to an element name, attribute name, schema type name, namespace prefix, or variable name that is not defined in the static context, except within an ElementTest or an AttributeTest."}
        ,{ "XQST0009", "An implementation that does not support the Schema Import Feature must raise a static error if a Prolog contains a schema import."}
        ,{ "XPST0010", "An implementation must raise a static error if it encounters a reference to an axis that it does not support."}
        ,{ "XQST0012", "It is a static error if the set of definitions contained in all schemas imported by a Prolog do not satisfy the conditions for schema validity specified in Sections 3 and 5 of [XML Schema] Part 1--i.e., each definition must be valid, complete, and unique."}
        ,{ "XQST0013", "It is a static error if an implementation recognizes a pragma but determines that its content is invalid."}
        ,{ "XQST0014", "(Not currently used.)"}
        ,{ "XQST0015", "(Not currently used.)"}
        ,{ "XQST0016", "An implementation that does not support the Module Feature raises a static error if it encounters a module declaration or a module import."}
        ,{ "XPST0017", "It is a static error if the expanded QName and number of arguments in a function call do not match the name and arity of a function signature in the static context."}
        ,{ "XPTY0018", "It is a type error if the result of the last step in a path expression contains both nodes and atomic values."}
        ,{ "XPTY0019", "It is a type error if the result of a step (other than the last step) in a path expression contains an atomic value."}
        ,{ "XPTY0020", "It is a type error if, in an axis step, the context item is not a node."}
        ,{ "XPDY0021", "(Not currently used.)"}
        ,{ "XQST0022", "It is a static error if the value of a namespace declaration attribute is not a URILiteral."}
        ,{ "XQTY0023", "(Not currently used.)"}
        ,{ "XQTY0024", "It is a type error if the content sequence in an element constructor contains an attribute node following a node that is not an attribute node."}
        ,{ "XQDY0025", "It is a dynamic error if any attribute of a constructed element does not have a name that is distinct from the names of all other attributes of the constructed element."}
        ,{ "XQDY0026", "It is a dynamic error if the result of the content expression of a computed processing instruction constructor contains the string \"?>\"."}
        ,{ "XQDY0027", "In a validate expression, it is a dynamic error if the root element information item in the PSVI resulting from validation does not have the expected validity property: valid if validation mode is strict, or either valid or notKnown if validation mode is lax."}
        ,{ "XQTY0028", "(Not currently used.)"}
        ,{ "XQDY0029", "(Not currently used.)"}
        ,{ "XQTY0030", "It is a type error if the argument of a validate expression does not evaluate to exactly one document or element node."}
        ,{ "XQST0031", "It is a static error if the version number specified in a version declaration is not supported by the implementation."}
        ,{ "XQST0032", "A static error is raised if a Prolog contains more than one base URI declaration."}
        ,{ "XQST0033", "It is a static error if a Prolog contains multiple declarations for the same namespace prefix."}
        ,{ "XQST0034", "It is a static error if multiple functions declared or imported by a module have the number of arguments and their expanded QNames are equal (as defined by the eq operator)."}
        ,{ "XQST0035", "It is a static error to import two schema components that both define the same name in the same symbol space and in the same scope."}
        ,{ "XQST0036", "It is a static error to import a module if the importing module's in-scope schema types do not include definitions for the schema type names that appear in the declarations of variables and functions (whether in an argument type or return type) that are present in the imported module and are referenced in the importing module."}
        ,{ "XQST0037", "(Not currently used.)"}
        ,{ "XQST0038", "It is a static error if a Prolog contains more than one default collation declaration, or the value specified by a default collation declaration is not present in statically known collations."}
        ,{ "XQST0039", "It is a static error for a function declaration to have more than one parameter with the same name."}
        ,{ "XQST0040", "It is a static error if the attributes specified by a direct element constructor do not have distinct expanded QNames."}
        ,{ "XQDY0041", "It is a dynamic error if the value of the name expression in a computed processing instruction constructor cannot be cast to the type xs:NCName."}
        ,{ "XQST0042", "(Not currently used.)"}
        ,{ "XQST0043", "(Not currently used.)"}
        ,{ "XQDY0044", "It is a dynamic error the node-name of a node constructed by a computed attribute constructor has any of the following properties: its namespace prefix is xmlns, it has no namespace prefix and its local name is xmlns, its namespace URI is http://www.w3.org/2000/xmlns/, its namespace prefix is xml and its namespace URI is not http://www.w3.org/XML/1998/namespace, its namespace prefix is other than xml and its namespace URI is http://www.w3.org/XML/1998/namespace."}
        ,{ "XQST0045", "It is a static error if the function name in a function declaration is in one of the following namespaces: http://www.w3.org/XML/1998/namespace, http://www.w3.org/2001/XMLSchema, http://www.w3.org/2001/XMLSchema-instance, http://www.w3.org/2005/xpath-functions, http://www.w3.org/2005/xpath-datatypes."}
        ,{ "XQST0046", "An implementation MAY raise a static error if the value of a URILiteral is of nonzero length and is not in the lexical space of xs:anyURI, or if it is a string that represents a \"relative reference\" as defined in [RFC3986]."}
        ,{ "XQST0047", "It is a static error if multiple module imports in the same Prolog specify the same target namespace."}
        ,{ "XQST0048", "It is a static error if a function or variable declared in a library module is not in the target namespace of the library module."}
        ,{ "XQST0049", "It is a static error if two or more variables declared or imported by a module have equal expanded QNames (as defined by the eq operator.)"}
        ,{ "XPDY0050", "It is a dynamic error if the dynamic type of the operand of a treat expression does not match the sequence type specified by the treat expression. This error might also be raised by a path expression beginning with \"/\" or \"//\" if the context node is not in a tree that is rooted at a document node. This is because a leading \"/\" or \"//\" in a path expression is an abbreviation for an initial step that includes the clause treat as document-node()."}
        ,{ "XPST0051", "It is a static error if a QName that is used as an AtomicType in a SequenceType is not defined in the in-scope schema types as an atomic type."}
        ,{ "XQDY0052", "(Not currently used.)"}
        ,{ "XQST0053", "(Not currently used.)"}
        ,{ "XQST0054", "It is a static error if the initializing expression in a variable declaration cannot be executed because of a circularity (for example, the expression depends on a function that in turn depends on the value of the initialized variable)."}
        ,{ "XQST0055", "It is a static error if a Prolog contains more than one copy-namespaces declaration."}
        ,{ "XQST0056", "(Not currently used.)"}
        ,{ "XQST0057", "It is a static error if a schema import binds a namespace prefix but does not specify a target namespace other than a zero-length string."}
        ,{ "XQST0058", "It is a static error if multiple schema imports specify the same target namespace."}
        ,{ "XQST0059", "It is a static error if an implementation is unable to process a schema or module import by finding a schema or module with the specified target namespace."}
        ,{ "XQST0060", "It is a static error if the name of a function in a function declaration is not in a namespace (expanded QName has a null namespace URI)."}
        ,{ "XQDY0061", "It is a dynamic error if the operand of a validate expression is a document node whose children do not consist of exactly one element node and zero or more comment and processing instruction nodes, in any order."}
        ,{ "XQDY0062", "(Not currently used.)"}
        ,{ "XQST0063", "(Not currently used.)"}
        ,{ "XQDY0064", "It is a dynamic error if the value of the name expression in a computed processing instruction constructor is equal to \"XML\" (in any combination of upper and lower case)."}
        ,{ "XQST0065", "A static error is raised if a Prolog contains more than one ordering mode declaration."}
        ,{ "XQST0066", "A static error is raised if a Prolog contains more than one default element/type namespace declaration, or more than one default function namespace declaration."}
        ,{ "XQST0067", "A static error is raised if a Prolog contains more than one construction declaration."}
        ,{ "XQST0068", "A static error is raised if a Prolog contains more than one boundary-space declaration."}
        ,{ "XQST0069", "A static error is raised if a Prolog contains more than one empty order declaration."}
        ,{ "XQST0070", "A static error is raised if one of the predefined prefixes xml or xmlns appears in a namespace declaration, or if any of the following conditions is statically detected in any expression or declaration: the prefix xml is bound to some namespace URI other than http://www.w3.org/XML/1998/namespace, a prefix other than xml is bound to the namespace URI http://www.w3.org/XML/1998/namespace, the prefix xmlns is bound to any namespace URI, a prefix other than xmlns is bound to the namespace URI http://www.w3.org/2000/xmlns/."}
        ,{ "XQST0071", "A static error is raised if the namespace declaration attributes of a direct element constructor do not have distinct names."}
        ,{ "XQDY0072", "It is a dynamic error if the result of the content expression of a computed comment constructor contains two adjacent hyphens or ends with a hyphen."}
        ,{ "XQST0073", "It is a static error if the graph of module imports contains a cycle (that is, if there exists a sequence of modules M1 ... Mn such that each Mi imports Mi+1 and Mn imports M1), unless all the modules in the cycle share a common namespace."}
        ,{ "XQDY0074", "It is a dynamic error if the value of the name expression in a computed element or attribute constructor cannot be converted to an expanded QName (for example, because it contains a namespace prefix not found in statically known namespaces.)"}
        ,{ "XQST0075", "An implementation that does not support the Validation Feature must raise a static error if it encounters a validate expression."}
        ,{ "XQST0076", "It is a static error if a collation subclause in an order by clause of a FLWOR expression does not identify a collation that is present in statically known collations."}
        ,{ "XQST0077", "(Not currently used.)"}
        ,{ "XQST0078", "(Not currently used.)"}
        ,{ "XQST0079", "It is a static error if an extension expression contains neither a pragma that is recognized by the implementation nor an expression enclosed in curly braces."}
        ,{ "XPST0080", "The target type of a cast or castable expression must be an atomic type that is in the in-scope schema types and is not xs:NOTATION or xs:anyAtomicType, optionally followed by the occurrence indicator \"?\"; otherwise a static error is raised."}
        ,{ "XPST0081", "It is a static error if a QName used in a query contains a namespace prefix that cannot be expanded into a namespace URI by using the statically known namespaces."}
        ,{ "XQST0082", "(Not currently used.)"}
        ,{ "XPST0083", "(Not currently used.)"}
        ,{ "XQDY0084", "It is a dynamic error if the element validated by a validate statement does not have a top-level element declaration in the in-scope element declarations, if validation mode is strict."}
        ,{ "XQST0085", "It is a static error if the namespace URI in a namespace declaration attribute is a zero-length string, and the implementation does not support [XML Names 1.1]."}
        ,{ "XQTY0086", "It is a type error if the typed value of a copied element or attribute node is namespace-sensitive when construction mode is preserve and copy-namespaces mode is no-preserve."}
        ,{ "XQST0087", "It is a static error if the encoding specified in a Version Declaration does not conform to the definition of EncName specified in [XML 1.0]."}
        ,{ "XQST0088", "It is a static error if the literal that specifies the target namespace in a module import or a module declaration is of zero length."}
        ,{ "XQST0089", "It is a static error if a variable bound in a for clause of a FLWOR expression, and its associated positional variable, do not have distinct names (expanded QNames)."}
        ,{ "XQST0090", "It is a static error if a character reference does not identify a valid character in the version of XML that is in use."}
        ,{ "XQST0093", "It is a static error to import a module M1 if there exists a sequence of modules M1 ... Mi ... M1 such that each module directly depends on the next module in the sequence."}
        ,{ "FOER0000", "Unidentified error."}
        ,{ "FOAR0001", "Division by zero. This error is raised whenever an attempt is made to divide by zero."}
        ,{ "FOAR0002", "Numeric operation overflow/underflow. This error is raised whenever numeric operations result in an overflow or underflow."}
        ,{ "FOCA0001", "Input value too large for decimal. "}
        ,{ "FOCA0002", "Invalid lexical value. "}
        ,{ "FOCA0003", "Input value too large for integer. "}
        ,{ "FOCA0005", "NaN supplied as float/double value. "}
        ,{ "FOCA0006", "String to be cast to decimal has too many digits of precision. "}
        ,{ "FOCH0001", "Code point not valid. "}
        ,{ "FOCH0002", "Unsupported collation. "}
        ,{ "FOCH0003", "Unsupported normalization form. "}
        ,{ "FOCH0004", "Collation does not support collation units. "}
        ,{ "FODC0001", "No context document. "}
        ,{ "FODC0002", "Error retrieving resource. "}
        ,{ "FODC0003", "Function stability not defined. "}
        ,{ "FODC0004", "Invalid argument to fn:collection. "}
        ,{ "FODC0005", "Invalid argument to fn:doc. "}
        ,{ "FODT0001", "Overflow/underflow in date/time operation. "}
        ,{ "FODT0002", "Overflow/underflow in duration operation. "}
        ,{ "FODT0003", "Invalid timezone value. "}
        ,{ "FONS0004", "No namespace found for prefix. "}
        ,{ "FONS0005", "Base-uri not defined in the static context. "}
        ,{ "FORG0001", "Invalid value for cast/constructor. "}
        ,{ "FORG0002", "Invalid argument to URL resolve algorithm. "}
        ,{ "FORG0003", "fn:zero-or-one called with a sequence containing more than one item. "}
        ,{ "FORG0004", "fn:one-or-more called with a sequence containing no items. "}
        ,{ "FORG0005", "fn:exactly-one called with a sequence containing zero or more than one item. "}
        ,{ "FORG0006", "Invalid argument type. "}
        ,{ "FORG0008", "Both arguments to fn:dateTime have a specified timezone. "}
        ,{ "FORG0009", "Error in resolving a relative URI against a base URI in fn:resolve-uri. "}
        ,{ "FORX0001", "Invalid regular expression flags. "}
        ,{ "FORX0002", "Invalid regular expression. "}
        ,{ "FORX0003", "Regular expression matches zero-length string. "}
        ,{ "FORX0004", "Invalid replacement string. "}
        ,{ "FOTY0012", "Argument node does not have a typed value. "}
        ,{ "SE1001", "Physical plan executor stack overflow."}
        ,{ "SE1002", "Feature is not implemented."}
        ,{ "SE1003", "Sedna internal error."}
        ,{ "SE1004", "Wrong physical plan representation."}
        ,{ "SE1005", "Scheme parser error."}
        ,{ "SE1006", "No document with this name in the specified collection."}
        ,{ "SE1007", "Invalid position in fn:item-at."}
        ,{ "SE1008", "Sedna index subsystem error."}
        ,{ "SE1009", "Buffer overflow."}
        ,{ "SE1011", "Data file has reached its maximum size."}
        ,{ "SE1012", "Temporary file has reached its maximum size."}
        ,{ "SE1013", "Cannot extend data file."}
        ,{ "SE1014", "Cannot extend temporary file."}
        ,{ "SE1015", "There is not enough memory to initialize buffers."}
        ,{ "SE1016", "Cannot lock buffer memory."}
        ,{ "SE1017", "Cannot mount ramfs."}
        ,{ "SE1018", "Transaction with this id already exists."}
        ,{ "SE1019", "There is no transaction with this id."}
        ,{ "SE1020", "The limit on the transaction on locked blocks in memory has been exceeded."}
        ,{ "SE1021", "Cannot lock the block in memory, because it is not in memory."}
        ,{ "SE1022", "Cannot unlock block, because it is not in memory."}
        ,{ "SE1023", "Unexpected arguments in call to Storage Manager."}
        ,{ "SE1031", "Cannot allocate enough address space segment."}
        ,{ "SE1032", "Error setting up alternate stack."}
        ,{ "SE1033", "Error setting up signal handler."}
        ,{ "SE1034", "Connection with Storage Manager lost."}
        ,{ "SE1035", "Memory mapping error."}
        ,{ "SE1036", "Cannot (un)swap blocks, because the address is out of bounds."}
        ,{ "SE1037", "Cannot open buffer memory."}
        ,{ "SE1038", "Cannot close buffer memory."}
        ,{ "SE1039", "Error waiting for the Virtual Memory Manager thread to shutdown."}
        ,{ "SE1040", "Cannot determine enough address space segment."}
        ,{ "SE1051", "Sedna query optimizer error."}
        ,{ "SE1061", "No index with this name."}
        ,{ "SE1071", "Expecting arguments of type xs:string."}
        ,{ "SE1072", "Modules to be loaded belong to different namespaces."}
        ,{ "SE1073", "Module with the given URI already loaded to the database."}
        ,{ "SE1074", "Unable to drop a module - no module with the given URI."}
        ,{ "SE2001", "Document with the same name already exists."}
        ,{ "SE2002", "Collection with the same name already exists."}
        ,{ "SE2003", "No collection with this name."}
        ,{ "SE2004", "Document with the same name already exists in the collection."}
        ,{ "SE2005", "Parse error at "}
        ,{ "SE2006", "No document with this name."}
        ,{ "SE2007", "Left sibling is not an attribute."}
        ,{ "SE2008", "Valid URI expected."}
        ,{ "SE2009", "Size of text should be greater than zero."}
        ,{ "SE2010", "Invalid result of the delete undeep argument: sequence contains non-persistent or document nodes."}
        ,{ "SE2011", "Invalid result of the delete argument: sequence contains atomic values."}
        ,{ "SE2012", "Invalid result of the delete argument: sequence contains temporary nodes."}
        ,{ "SE2013", "Invalid result of the second insert argument: sequence contains atomic values or temporary nodes."}
        ,{ "SE2014", "Invalid result of the first insert argument: bad sequence of nodes."}
        ,{ "SE2015", "Invalid result of the first insert argument: sequence contains atomic values."}
        ,{ "SE2016", "Attempt to insert element before attribute."}
        ,{ "SE2017", "Attempt to insert the node to its descendant."}
        ,{ "SE2018", "Invalid result of the second insert argument: sequence contains either attribute, namespace, comment, PI or temporary node."}
        ,{ "SE2019", "Invalid result of the second insert argument: sequence contains atomic values."}
        ,{ "SE2020", "Invalid result of the update argument: sequence contains atomic values or one of these nodes: temporary, text, comment, PI, namespace, document."}
        ,{ "SE2021", "Invalid result of the update argument: sequence contains atomic values."}
        ,{ "SE2022", "This node test is not yet implemented."}
        ,{ "SE2023", "[nid_assign] The length of prefix exceeds PSTRMAXSIZE."}
        ,{ "SE2024", "Trying to store a string that exceeds the maximum permitted size."}
        ,{ "SE2025", "checkTreeConsistency:Ancestor-descendant error."}
        ,{ "SE2026", "checkTreeConsistency:First child pointer."}
        ,{ "SE2027", "checkTreeConsistency:sibling pointer errors."}
        ,{ "SE2028", "checkTreeConsistency:nid comparison error."}
        ,{ "SE2029", "checkTreeConsistency:wrong descriptor's order."}
        ,{ "SE2030", "checkTreeConsistency:Bad indirection table."}
        ,{ "SE2031", "Atomic value as input for test engine."}
        ,{ "SE2032", "Trying to create mixed content in the element whose value is used as key."}
        ,{ "SE2033", "An index with the same name already exists."}
        ,{ "SE2034", "Invalid index type, only xs:string, xs:integer, xs:float, xs:double, xs:date, xs:time, xs:dateTime, xs_yearMonthDuration, xs_dateTimeDuration are supported in B-tree based index."}
        ,{ "SE2035", "Invalid mode in index_scan_between function."}
        ,{ "SE2036", "Document node deletion is prohibited by this function, use DROP DOCUMENT in metadata API."}
        ,{ "SE2037", "The size of string is limited (4GB approximately)."}
        ,{ "SE2038", "An attempt to insert attribute node after element."}
        ,{ "SE2100", "SQL:Bad connect option."}
        ,{ "SE2101", "SQL:Bad handle."}
        ,{ "SE2102", "SQL:Failed to get executor."}
        ,{ "SE2103", "SQL:Unknown handle type."}
        ,{ "SE2104", "SQL:Invalid handle type."}
        ,{ "SE2105", "SQL:Failed to prepare statement."}
        ,{ "SE2106", "SQL:Failed to execute prepared statement."}
        ,{ "SE2107", "SQL:Not enough parameters for prepared statement."}
        ,{ "SE2108", "SQL:Disconnect failed."}
        ,{ "SE2109", "SQL:Commit failed."}
        ,{ "SE2110", "SQL:Rollback failed."}
        ,{ "SE2111", "SQL:Connect failed."}
        ,{ "SE2112", "SQL:Execute failed."}
        ,{ "SE2113", "SQL Connection support disabled."}
        ,{ "SE2200", "External function initialization error."}
        ,{ "SE2201", "External function invocation error."}
        ,{ "SE2202", "External function de-initialization error."}
        ,{ "SE2203", "External function load error."}
        ,{ "SE2999", "Sedna Client-Server Protocol used in your application does not support this feature. Use the protocol of the most recent version."}
        ,{ "SE3000", "Failed to clean up socket library."}
        ,{ "SE3001", "Failed to initialize a socket."}
        ,{ "SE3002", "Failed to get local host name."}
        ,{ "SE3003", "Failed to connect to the specified host."}
        ,{ "SE3004", "Failed to bind the socket to the specified port."}
        ,{ "SE3005", "Failed to set the socket into the listening mode."}
        ,{ "SE3006", "Failed to send a message."}
        ,{ "SE3007", "Failed to receive a message."}
        ,{ "SE3008", "Unknown message from server."}
        ,{ "SE3009", "Unknown message from client."}
        ,{ "SE3010", "Cannot duplicate socket handle."}
        ,{ "SE3011", "Failed to close a socket."}
        ,{ "SE3012", "Message length exceeds available size."}
        ,{ "SE3013", "Cannot get file from the client to be loaded."}
        ,{ "SE3014", "Wrong client-server protocol version."}
        ,{ "SE3015", "Too long login/password/databasename."}
        ,{ "SE3016", "Failed to initialize socket library."}
        ,{ "SE3017", "Cannot open file with data to load."}
        ,{ "SE3018", "Cannot read file with data to load."}
        ,{ "SE3019", "Cannot close file with data to load."}
        ,{ "SE3020", "Cannot close tmp file."}
        ,{ "SE3021", "Cannot delete tmp file."}
        ,{ "SE3022", "Invalid argument."}
        ,{ "SE3023", "Database name is too long."}
        ,{ "SE3024", "Login name (user name) is too long."}
        ,{ "SE3025", "Password is too long."}
        ,{ "SE3026", "URL is too long."}
        ,{ "SE3027", "Failed to set socket option."}
        ,{ "SE3028", "Connection with server is closed or has not been established yet."}
        ,{ "SE3029", "This function call is prohibited as the connection is in the autocommit mode."}
        ,{ "SE3030", "Failed to initialize SSMMsg service (message service)."}
        ,{ "SE3031", "Failed to serve clients via SSMMsg service (message service)."}
        ,{ "SE3032", "Failed to stop serve clients via SSMMsg service (message service)."}
        ,{ "SE3033", "Failed to shutdown SSMMsg service (message service)."}
        ,{ "SE3034", "Cannot send message via SSMMsg"}
        ,{ "SE3040", "Connection with GOVERNOR lost."}
        ,{ "SE3043", "Can not register session in GOVERNOR."}
        ,{ "SE3044", "Can not unregister session in GOVERNOR."}
        ,{ "SE3045", "Can not register Storage Manager in GOVERNOR."}
        ,{ "SE3046", "Cannot create new session, because the number of sessions exceeds the permissible amount."}
        ,{ "SE3047", "Cannot open session, because the client failed to send the authentication parameters on time."}
        ,{ "SE3051", "Failed to set up ctrl handler."}
        ,{ "SE3052", "Failed to run se_trn process."}
        ,{ "SE3053", "Authentication failed."}
        ,{ "SE3054", "Cannot run session: system is busy."}
        ,{ "SE3060", "Failed to create a new ACL."}
        ,{ "SE3061", "Failed to set DACL to the data file security descriptor."}
        ,{ "SE3062", "Failed to open process token."}
        ,{ "SE3063", "Failed to release ACL."}
        ,{ "SE3064", "You do not have enough permissions: you have to be root in UNIX or a member of the Administrators group in Windows to be able to run the application."}
        ,{ "SE3065", "You do not have the necessary privileges on this database object."}
        ,{ "SE3066", "Failed to process authorization."}
        ,{ "SE3067", "User name is not specified."}
        ,{ "SE3068", "This statement is not supported, because the database security level of Sedna is \"off\". To support this statement create a database with -db-security option \"authentication\"."}
        ,{ "SE3069", "Wrong privilege name."}
        ,{ "SE3070", "Multiple parameters parted by commas are not supported in the current version of Sedna."}
        ,{ "SE3071", "Failed to load authorization metadata."}
        ,{ "SE3072", "User does not have privilege."}
        ,{ "SE3073", "User is not allowed to grant this privilege."}
        ,{ "SE3074", "User is not allowed to grant this role."}
        ,{ "SE3075", "User is not allowed to revoke this privilege, or the grantee does not have this privilege."}
        ,{ "SE3076", "User is not allowed to revoke this role, or the grantee does not have this role."}
        ,{ "SE3077", "User is not allowed to alter the specified user."}
        ,{ "SE3078", "User is not allowed to drop the specified user."}
        ,{ "SE3079", "User with this name already exists."}
        ,{ "SE3080", "Role with this name already exists."}
        ,{ "SE3200", "Trigger with this name already exists."}
        ,{ "SE3201", "Failed to execute trigger action."}
        ,{ "SE3202", "Wrong trigger action parameter type."}
        ,{ "SE3203", "Trigger action results in an item that is not a node."}
        ,{ "SE3204", "Trigger action must always return a result."}
        ,{ "SE3205", "Trigger action tries to update a document/collection that is currently being updated by the outer update statement."}
        ,{ "SE3206", "Cannot execute trigger action, since the current cascade level exceeds the permissible level."}
        ,{ "SE4001", "XQuery parser internal error."}
        ,{ "SE4002", "Unexpected type of the query given."}
        ,{ "SE4003", "Unexpected number of statements given."}
        ,{ "SE4004", "Scheme part unknown error."}
        ,{ "SE4005", "Invalid list after scheme processing."}
        ,{ "SE4006", "Static query analysis error."}
        ,{ "SE4007", "Too long statement."}
        ,{ "SE4008", "Wrong logical plan representation."}
        ,{ "SE4009", "Too long input query."}
        ,{ "SE4010", "Cannot create semaphore."}
        ,{ "SE4011", "Cannot release semaphore."}
        ,{ "SE4012", "Cannot open semaphore."}
        ,{ "SE4013", "Cannot close semaphore."}
        ,{ "SE4014", "Cannot up semaphore."}
        ,{ "SE4015", "Cannot down semaphore."}
        ,{ "SE4016", "Cannot create shared memory."}
        ,{ "SE4020", "Cannot release shared memory."}
        ,{ "SE4021", "Cannot open shared memory."}
        ,{ "SE4022", "Cannot close shared memory."}
        ,{ "SE4023", "Cannot attach to shared memory."}
        ,{ "SE4024", "Cannot deattach from shared memory."}
        ,{ "SE4025", "Cannot create pipe."}
        ,{ "SE4030", "Cannot close pipe."}
        ,{ "SE4031", "Cannot read pipe."}
        ,{ "SE4032", "Cannot write pipe."}
        ,{ "SE4040", "Cannot create file."}
        ,{ "SE4041", "Cannot delete file."}
        ,{ "SE4042", "Cannot open file."}
        ,{ "SE4043", "Cannot close file."}
        ,{ "SE4044", "Cannot read file."}
        ,{ "SE4045", "Cannot write file."}
        ,{ "SE4046", "Cannot set file pointer."}
        ,{ "SE4047", "Cannot set end of file."}
        ,{ "SE4048", "Cannot create directory."}
        ,{ "SE4049", "Cannot copy file."}
        ,{ "SE4050", "Cannot get file size."}
        ,{ "SE4051", "Cannot get disk sector size."}
        ,{ "SE4052", "Cannot get unique file name."}
        ,{ "SE4053", "Cannot open directory."}
        ,{ "SE4054", "Cannot close directory."}
        ,{ "SE4055", "Cannot create directory."}
        ,{ "SE4060", "Cannot create thread."}
        ,{ "SE4061", "Cannot suspend thread."}
        ,{ "SE4062", "Cannot resume thread."}
        ,{ "SE4063", "Cannot close thread."}
        ,{ "SE4064", "Cannot exit thread."}
        ,{ "SE4065", "Cannot sleep thread."}
        ,{ "SE4070", "Cannot create process."}
        ,{ "SE4071", "Cannot terminate process."}
        ,{ "SE4072", "Cannot set environment variable."}
        ,{ "SE4073", "Cannot get environment variable."}
        ,{ "SE4074", "Cannot create memory mapping."}
        ,{ "SE4075", "Cannot release memory mapping."}
        ,{ "SE4076", "Cannot open memory mapping."}
        ,{ "SE4077", "Cannot close memory mapping."}
        ,{ "SE4078", "Cannot perform memory mapping."}
        ,{ "SE4079", "Cannot perform memory unmapping."}
        ,{ "SE4080", "Cannot set handles property."}
        ,{ "SE4081", "Cannot get image path of the process."}
        ,{ "SE4082", "Bad query encoding."}
        ,{ "SE4083", "Cannot read directory."}
        ,{ "SE4150", "Logical log read buffer is too small."}
        ,{ "SE4151", "The shared memory size for logical log is too small."}
        ,{ "SE4152", "Bad parameters: the start LSN is less than the end LSN."}
        ,{ "SE4153", "Bad checkpoint record given."}
        ,{ "SE4154", "Bad record from logical log given."}
        ,{ "SE4155", "Bad transaction identifier given."}
        ,{ "SE4156", "Too large record for logical log"}
        ,{ "SE4200", "There is no database with the specified name."}
        ,{ "SE4201", "Not Well-Formed Config file."}
        ,{ "SE4202", "Storage Manager startup failure: Sedna server is not running."}
        ,{ "SE4203", "Cannot send message via SSMMsg."}
        ,{ "SE4204", "Database with the same name is already running."}
        ,{ "SE4205", "Failed to run Storage Manager in the background mode; use \"-background-mode off\" for detailed diagnostics."}
        ,{ "SE4206", "Failed to initialize system parameters."}
        ,{ "SE4207", "Failed to set up ctrl handler."}
        ,{ "SE4208", "Failed to shutdown Storage Manager: Sedna server is not running."}
        ,{ "SE4209", "Failed to shutdown Storage Manager."}
        ,{ "SE4210", "Error waiting for checkpoint thread to shutdown."}
        ,{ "SE4211", "Failed to create the database."}
        ,{ "SE4212", "Database files format is incompatible with SEDNA binaries."}
        ,{ "SE4300", "Path is not valid."}
        ,{ "SE4301", "Cannot initialize system structures."}
        ,{ "SE4302", "Cannot create persistent heap."}
        ,{ "SE4303", "Cannot allocate memory from persistent heap."}
        ,{ "SE4304", "Cannot close persistent heap."}
        ,{ "SE4305", "Cannot release system structures."}
        ,{ "SE4306", "Cannot back up PH (persistent heap)."}
        ,{ "SE4307", "Invalid database name."}
        ,{ "SE4308", "Failed to drop a database."}
        ,{ "SE4400", "SEDNA server is not running. Did you forget to run se_gov command?"}
        ,{ "SE4401", "Failed to run GOVERNOR in the background mode; use \"-background-mode off\" for detailed diagnostics."}
        ,{ "SE4402", "Failed to run GOVERNOR."}
        ,{ "SE4403", "Failed to set up ctrl handler for GOVERNOR."}
        ,{ "SE4404", "Error occured during closing GOVERNOR."}
        ,{ "SE4405", "Session cannot be closed."}
        ,{ "SE4406", "There is no sign of the SEDNA server running in the system."}
        ,{ "SE4408", "Failed to run GOVERNOR: SEDNA server is running."}
        ,{ "SE4409", "Failed to open session: database is not started."}
        ,{ "SE4410", "Cannot rename last soft fault directory."}
        ,{ "SE4411", "Cannot set sedna data variable."}
        ,{ "SE4412", "The number of database config files exceeds the maximum allowable number of config files."}
        ,{ "SE4413", "Cannot create session process."}
        ,{ "SE4500", "Bad logical record given from logical log."}
        ,{ "SE4501", "Cannot recover database by logical log."}
        ,{ "SE4510", "Hot-backup utility error."}
        ,{ "SE4600", "One of the command line arguments is too long."}
        ,{ "SE4601", "Command line arguments are not correct."}
        ,{ "SE4602", "Cannot get current working directory absolute path."}
        ,{ "SE4603", "Cannot get absolute path to the file."}
        ,{ "SE4604", "Cannot change working directory."}
        ,{ "SE4605", "Initialization of persistent heap failed."}
        ,{ "SE4606", "Release of persistent heap failed."}
        ,{ "SE4607", "Cannot run transaction: system is busy."}
        ,{ "SE4608", "Transaction is rolled back, because server is stopping."}
        ,{ "SE4609", "The database does not exist."}
        ,{ "SE4610", "There is no transaction to commit."}
        ,{ "SE4611", "There is no transaction to roll back."}
        ,{ "SE4612", "Commit current transaction before beginning a new one."}
        ,{ "SE4613", "Since version 0.6 of sedna the command se_trn is an internal process and cannot be run manually. Use se_term instead."}
        ,{ "SE4614", "There is no next item of the user's query."}
        ,{ "SE4615", "Begin transaction before executing a query."}
        ,{ "SE4616", "Cannot load a document, because the session is loading another document. Finish current loading before beginning a new one."}
        ,{ "SE4617", "Failed to set session option (invalid value)"}
        ,{ "SE4618", "Reserved."}
        ,{ "SE4700", "Unknown resource identifier type."}
        ,{ "SE4701", "Internal Lock Manager error."}
        ,{ "SE4702", "The length of the resource name is too long."}
        ,{ "SE4703", "The transaction is a victim of deadlock resolution procedure."}
        ,{ "SE4704", "Unknown reply from Lock Manager."}
        ,{ "SE4705", "Deadlock is detected."}
        ,{ "SE4706", "Cannot perform update operations in read-only mode."}
        ,{ "SE5000", "Unexpected number of arguments."}
        ,{ "SE5001", "Prolog not found for query."}
        ,{ "SE5002", "Body not found for query."}
        ,{ "SE5003", "Empty or unexpected query."}
        ,{ "SE5004", "Unexpected query."}
        ,{ "SE5005", "Unexpected expression."}
        ,{ "SE5006", "Operation not yet supported."}
        ,{ "SE5008", "Unexpected namespace prefix."}
        ,{ "SE5012", "Declaration not supported."}
        ,{ "SE5014", "Not a constant."}
        ,{ "SE5015", "Not a proper QName (qualified name)."}
        ,{ "SE5016", "Unknown item type."}
        ,{ "SE5017", "Not a name specifier."}
        ,{ "SE5018", "Not a type declaration."}
        ,{ "SE5019", "Improper list of formal parameters."}
        ,{ "SE5020", "Not a valid variable name."}
        ,{ "SE5021", "Not a return type declaration."}
        ,{ "SE5022", "Not a function body."}
        ,{ "SE5023", "Malformed variable name."}
        ,{ "SE5026", "Type definition for constant not found."}
        ,{ "SE5027", "Constant value is not compatible with the type definition."}
        ,{ "SE5028", "Constant is not a proper QName (qualified name)."}
        ,{ "SE5030", "Not a type specifier."}
        ,{ "SE5032", "Not an anonimous function definition."}
        ,{ "SE5033", "Too many arguments in a function."}
        ,{ "SE5034", "DDO contains atomic values in its argument."}
        ,{ "SE5035", "Not an ivar declaration."}
        ,{ "SE5036", "No function name provided in the function call."}
        ,{ "SE5040", "Empty or unexpected update operation."}
        ,{ "SE5041", "Unknown update operation."}
        ,{ "SE5042", "Insert is applied to a non-node type."}
        ,{ "SE5043", "Rename is applied to a non-node type."}
        ,{ "SE5044", "Delete is applied to a non-node type."}
        ,{ "SE5045", "Empty or unexpected manage operation."}
        ,{ "SE5046", "Unknown manage operation."}
        ,{ "SE5047", "Empty or unexpected metadata operation."}
        ,{ "SE5048", "Unknown metadata operation."}
        ,{ "SE5049", "Not a structural XPath supplied."}
        ,{ "SE5050", "Unknown mode supplied for index-scan function call."}
        ,{ "SE5051", "Unknown range specified for index-scan-between function call."}
        ,{ "SE5054", "Unexpected value of the boundary-space declaration."}
        ,{ "SE5055", "Unknown option in XQuery prolog."}
        ,{ "SE5056", "Malformed cases supplied in a typeswitch operation."}
        ,{ "SE5057", "No default case supplied for a typeswitch operation."}
        ,{ "SE5058", "Unexpected case for a typeswitch operation."}
        ,{ "SE5059", "Malformed default case for a typeswitch operation."}
        ,{ "SE5060", "Unexpected default empty order declaration in XQuery prolog."}
        ,{ "SE5061", "Malformed ascending/descending order declaration in ORDER BY clause."}
        ,{ "SE5062", "Malformed empty greatest / empty least declaration in ORDER BY clause."}
        ,{ "SE5063", "Malformed stable ORDER BY."}
        ,{ "SE5064", "Order modifier expected."}
        ,{ "SE5065", "Order specification expected."}
        ,{ "SE5066", "Order specifications expected."}
        ,{ "SE5067", "Malformed name-value pair in Sedna-specific option declaration."}
        ,{ "SE5068", "Unknown key(s) given in se:output option."}
        ,{ "SE5069", "Empty option value for Sedna-specific option."}
        ,{ "SE5070", "Duplicate key entry in se:output option."}
        ,{ "SE5071", "Unknown value bound with a \"method\" key in se:output option."}
        ,{ "SE5072", "Unknown value bound with an \"indent\" key in se:output option."}
        ,{ "SE5073", "Unknown time specifier in CREATE TRIGGER statement. Expected: BEFORE or AFTER."}
        ,{ "SE5074", "Unknown event specifier in CREATE TRIGGER statement."}
        ,{ "SE5075", "Malformed list of statements in the DO-clause of CREATE TRIGGER statement."}
        ,{ "SE5076", "Unknown granularity specified in CREATE TRIGGER statement."}
        ,{ "SE5077", "Variable declaration expected."}
        ,{ "SE5078", "LibraryModule expected, given unexpected."}
        ,{ "SE5079", "Unexpected ModuleDecl supplied."}
        ,{ "SE5080", "Unknown full-text index type supplied for a CREATE FULL-TEXT INDEX statement."}
        ,{ "SE5081", "Ill-formed \"customized-value\" full-text index type provided."}
        ,{ "SE5100", "Error in Scheme part."}
        ,{ "SE5101", "Scheme part panic."}
        ,{ "SE5500", "An attempt to create a statement on a closed connection."}
        ,{ "SE5501", "Result item cannot be returned as a String because it is too large."}
        ,{ "SE5502", "Unsupported encoding."}
        ,{ "SE6000", "User statement is too large: the maximum size allowed is 2 Mb."}
        ,{ "SE9000", "User defined error"}
        ,{ "SE2039", "Invalid result of the second insert argument: sequence contains non-persistent or document nodes."}
        ,{ "SE3207", "XPath expression after the \"ON\" keyword is invalid."}
        ,{ "SE3208", "The trigger variable is used but undefined in this context."}
        ,{ "SE3209", "It is prohibited to use trigger variables in statement-level triggers."}
        ,{ "SE4619", "Unknown session option."}
        ,{ "SE3210", "Trigger action in a node-level trigger must end with an XQuery query."}
        ,{ "SE3211", "No trigger with this name."}
        ,{ "SE2040", "Too many children by schema."}
        ,{ "SE4620", "Transaction has been rolled back as a result of a timeout or hard stop request."}
        ,{ "SE4801", "Cannot initialize wu."}
        ,{ "SE4802", "Cannot release wu."}
        ,{ "SE2041", "Result is cut, because its size exceeds the maximum allowed size set by the client."}
        ,{ "SE4901", "Internal LFS error."}
        ,{ "SE4902", "Internal LL error."}
        ,{ "SE4903", "Hot-backup error."}
        ,{ "SE4621", "Property is unknown."}
        ,{ "SE4622", "This statement is not supported because the database security level of Sedna is \"authentication\". To support this statement create database with -db-security option \"authorization\"."}
        ,{ "SE5200", "Internal Runtime Configuration utility error."}
        ,{ "SE4623", "Cannot set keep alive session timeout."}
        ,{ "SE4624", "Session was closed, because the keep alive timeout has been reached."}
        ,{ "SE3081", "Cannot open a file with a long query to execute."}
        ,{ "XQDY0096", "It is a dynamic error the node-name of a node constructed by a computed element constructor has any of the following properties: its namespace prefix is xmlns, its namespace URI is http://www.w3.org/2000/xmlns/, its namespace prefix is xml and its namespace URI is not http://www.w3.org/XML/1998/namespace, its namespace prefix is other than xml and its namespace URI is http://www.w3.org/XML/1998/namespace."}
        ,{ "SE3082", "Prolog is prohibited in CREATE TRIGGER statements"}
        ,{ "SE2301", "Unsupported serialization method."}
        ,{ "SE2302", "Serialization internal error: unknown node type passed."}
        ,{ "SE2901", "The feature is no longer supported."}
        ,{ "SE4084", "Unsupported index type."}
        ,{ "SE2042", "Invalid index type, only xs:string is supported in BST based index."}
        ,{ "SE2043", "Too long attribute value."}
    };
}
