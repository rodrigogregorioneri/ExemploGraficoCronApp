window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

var lista, sp, ba, rj;

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Bloco.lista = function() {
	lista = [cronapi.util.callServerBlockly('blockly.Bloco:sp'),
			cronapi.util.callServerBlockly('blockly.Bloco:rj'),
			cronapi.util.callServerBlockly('blockly.Bloco:ba')];
	window.cronapi.screen.createScopeVariable('lista', lista);
}
