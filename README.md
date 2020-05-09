jlink --module-path ./lib --output myimage --add-modules edu.chinna.kadhira.consumer --launcher=kondapalli=edu.chinna.kadhira.consumer

classes in classpath can reach in other classes in classpath
classes in moulepath can reach in other classes in moulepath
classes in moulepath can reach in other classes in classpath
classes in classpath can't reach in other classes in moulepath

To find java module information :  jar -f jar-file -d 

To Run on class path : java -classpath jar-file class-name

To Run on module path :java -p jar-file -m module-name/java class-name

un-named modules sit under the class-path, un-named modules can talk with other un-named modules.

Eg : java -classpath automatic-module/target/automatic-module-1.0.1.jar;automatic-dependent/target/automatic-dependent-1.0.1.jar; edu.chinna.kadhira.modules.automaticmodule.App

automatic modules sit under the module path, automatic modules can talk with other automatic modules.

Eg: java -p automatic-module/target/automatic-module-1.0.1.jar;automatic-dependent/target/automatic-dependent-1.0.1.jar; -m automatic.module/edu.chinna.kadhira.modules.automaticmodule.App

rule one for automatic modules ==> automatic modules can talk with un-named modules.

Eg : java -p automatic-module/target/automatic-module-1.0.1.jar -classpath automatic-dependent/target/automatic-dependent-1.0.1.jar; -m automatic.module/edu.chinna.kadhira.modules.automaticmodule.App

Rule two for Automatic Modules ==> un-named modules can't talk with other automatic modules.
Eg: java -classpath automatic-module/target/automatic-module-1.0.1.jar -m automatic-dependent/target/automatic-dependent-1.0.1.jar edu.chinna.kadhira.modules.automaticmodule.App

Explicit module will have module descriptor. 

Eg : java -p consumer-module/target/consumer-module-1.0.1.jar;util-module/target/util-module-1.0.1.jar;second-module/target/second-module-1.0.1.jar; -m edu.chinna.kadhira.consumer/edu.chinna.kadhira.consumer.App

