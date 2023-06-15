<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * dummy
 */
class ExampleResponse
{
    /**
     * @DTA\Data(field="emptyString", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $empty_string;

    /**
     * @DTA\Data(field="numberString", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $number_string;

    /**
     * @DTA\Data(field="boolString", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $bool_string;

    /**
     * @DTA\Data(field="nullString", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $null_string;

    /**
     * @DTA\Data(field="aBool", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $a_bool;

    /**
     * @DTA\Data(field="zero", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $zero;

}
