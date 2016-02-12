var Recipe = function () {
    var ingredientLabel;
    var ingredientCount;

    function getNamePrefix() {          
        return "recipe.ingredients[" + ingredientCount + "]";
    };
    
    function createIngredientLabel() {
        return ingredientLabel + ' #' + (ingredientCount + 1) + ':';
    };
    
    function createInputTag(name, size, id) {
        var s = '<input type="text" size="' + size + '" name="' + name + '"';
        if (id) { s += ' id="' + id + '"'; }
        return s + '/>';
    }
    
    function createQuantityInput() {
        return createInputTag(getNamePrefix() + ".quantity", 5, "count_" + ingredientCount);
    };
    
    function createNameInput() {
        return createInputTag(getNamePrefix() + ".name", 30);
    };
    
    function createIngredientRow() {
        return [
            '<tr>',
            '  <td class="tdLabel">',
            '    <label class="label">',
            '      ' + createIngredientLabel(), 
            '    </label>',
            '  </td>',
            '  <td>',
            '    ' + createQuantityInput(),
            '    ' + createNameInput(),
            '  </td>',
            '</tr>'
        ].join("\n");
    }
    
    return {
    	prepare: function (label, count) {
    		ingredientLabel = label;
    		ingredientCount = count;
    	},
    	
        addRow: function (label) {
            $("#addRow").before(createIngredientRow());
            $("#count_" + ingredientCount).focus();
            ingredientCount++;
            return false;
        }
    };
}();    
