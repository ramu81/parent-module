 module edu.chinna.kadhira.utilmodule {
	exports edu.chinna.kadhira.util;
	opens edu.chinna.kadhira.fibonacci;
	requires transitive edu.chinna.kadhira.secondmodule;
}